package com.mindgate.main.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.mindgate.main.domain.Customer;
import com.mindgate.main.processor.CustomerProcessor;

@Configuration
public class CustomerSpringBatchConfig {

	public CustomerProcessor customerProcessor() {
		return new CustomerProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<Customer> writer(DataSource dataSource) {
		JdbcBatchItemWriterBuilder<Customer> batchItemWriterBuilder = new JdbcBatchItemWriterBuilder<>();
		batchItemWriterBuilder
				.itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Customer>());
		batchItemWriterBuilder.sql("insert into customer_details values(:customerId , :firstName , :lastName)");
		batchItemWriterBuilder.dataSource(dataSource);

		JdbcBatchItemWriter<Customer> batchItemWriter = batchItemWriterBuilder.build();
		return batchItemWriter;
	}

	public LineMapper<Customer> lineMapper() {
		DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
		delimitedLineTokenizer.setDelimiter(",");
		delimitedLineTokenizer.setStrict(false);
		delimitedLineTokenizer.setNames("customerId", "firstName", "lastName");

		BeanWrapperFieldSetMapper<Customer> beanWrapperFieldSetMapper = new BeanWrapperFieldSetMapper<>();
		beanWrapperFieldSetMapper.setTargetType(Customer.class);

		DefaultLineMapper<Customer> defaultLineMapper = new DefaultLineMapper<>();
		defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);
		defaultLineMapper.setFieldSetMapper(beanWrapperFieldSetMapper);

		return defaultLineMapper;
	}

	@Bean
	public FlatFileItemReader<Customer> customerReader() {
		FlatFileItemReader<Customer> flatFileItemReader = new FlatFileItemReader<>();
		flatFileItemReader.setResource(new FileSystemResource("src/main/resources/customer.csv"));
		flatFileItemReader.setName("csvReader");
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setLineMapper(lineMapper());

		return flatFileItemReader;
	}

	@Bean
	public Step step1(JobRepository jobRepository, JdbcBatchItemWriter<Customer> jdbcBatchItemWriter,
			PlatformTransactionManager platformTransactionManager) {
		Step step = new StepBuilder("step1", jobRepository).<Customer, Customer>chunk(10, platformTransactionManager)
				.reader(customerReader()).processor(customerProcessor()).writer(jdbcBatchItemWriter).build();
		return step;
	}

	@Bean
	public Job job(JobRepository jobRepository, Step step1) {
		Job job = new JobBuilder("importCustomers", jobRepository).flow(step1).end().build();
		return job;
	}

}
