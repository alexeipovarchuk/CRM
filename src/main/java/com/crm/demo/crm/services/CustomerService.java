package com.crm.demo.crm.services;

import com.crm.demo.crm.models.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    long saveCustomer(Customer customer);
}
