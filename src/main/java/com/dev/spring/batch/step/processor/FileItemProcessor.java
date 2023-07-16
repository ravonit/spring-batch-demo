package com.dev.spring.batch.step.processor;

import com.dev.spring.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class FileItemProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
