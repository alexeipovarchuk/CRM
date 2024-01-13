package com.crm.demo.crm.controller;

import com.crm.demo.crm.models.Customer;
import com.crm.demo.crm.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> getCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }

    @PostMapping
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
            System.out.println(customer);
            long id = customerService.saveCustomer(customer);
            return new ResponseEntity("Customer was created: new id is " + id, HttpStatus.CREATED);

        }
    }

