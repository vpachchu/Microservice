package com.haswini.service;

import com.haswini.rentcloud.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    Customer save(Customer customer);
}
