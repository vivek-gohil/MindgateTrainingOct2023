package com.mindgate.main.processor;

import org.springframework.batch.item.ItemProcessor;

import com.mindgate.main.domain.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
	@Override
	public Customer process(Customer customer) throws Exception {
		return customer;
	}

}
