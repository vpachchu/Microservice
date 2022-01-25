package com.haswini.service.controller;

import com.haswini.rentcloud.Customer;
import com.haswini.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    public Customer save(@RequestBody Customer customer)
    {
        return customerService.save(customer);
    }

}
