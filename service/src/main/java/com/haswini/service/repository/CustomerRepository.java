package com.haswini.service.repository;

import com.haswini.rentcloud.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
}
