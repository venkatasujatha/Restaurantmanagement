package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Customer;
import com.example.demo.Model.Orders;
import com.example.demo.Model.Restaurant;

public interface ServiceInterface {



	Restaurant addRess(Restaurant restaurant);

	List<Restaurant> findAllDetails(String rname);

	List<Customer> findByName(String cname);

	List<Orders> findByID(int cid);

	

	Customer saveCus(int cid);

	Customer saveCus(Customer customer, int cid);



	

}
