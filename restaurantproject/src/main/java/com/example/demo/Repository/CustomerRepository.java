package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Customer;
import com.example.demo.Model.Orders;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	

	

}
