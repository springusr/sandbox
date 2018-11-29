package com.example.demo;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyItemProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public Customer process(Customer customer) throws Exception {
            customer.setFirstName(customer.getFirstName().toUpperCase());
            return customer;
}
}

