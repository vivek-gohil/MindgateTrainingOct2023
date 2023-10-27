package com.mindgate.main.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customerbatchapi")
public class CustomerController {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job job;

	@RequestMapping("import")
	public String importData() {

		JobParameters jobParameters = new JobParametersBuilder()
				.addLong("startAt", System.currentTimeMillis())
				.toJobParameters();
		
		try {
			jobLauncher.run(job, jobParameters);
		} catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException
				| JobParametersInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "All customers are imported successfully!!";
	}

}
