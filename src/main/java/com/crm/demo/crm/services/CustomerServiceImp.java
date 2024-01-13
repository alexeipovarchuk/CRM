package com.crm.demo.crm.services;

import com.crm.demo.crm.models.Customer;
import com.crm.demo.crm.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllCustomers() {
      //  List<Customer> customers = List.of(new Customer(1, "ГУП Строй"), new Customer(2, "ИП Купринов АВ"));
        return customerRepository.findAll();
    }

    @Override
    public long saveCustomer(Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer.getIdCustomer();
    }
}
