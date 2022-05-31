package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.Model.Orders;
import com.example.demo.Model.Restaurant;
import com.example.demo.Service.ServiceInterface;

@RestController
public class RestaurantController {
	
	@Autowired
	private ServiceInterface serviceInterface;
	
	@PostMapping("/save")
	public Restaurant addRes(@RequestBody Restaurant restaurant)
	{
		return serviceInterface.addRess(restaurant);
	}
	@GetMapping("/get/{rname}")
	public List<Restaurant> findAllDetails(@PathVariable String rname)
	{
		return serviceInterface.findAllDetails(rname);
	}
	@GetMapping("/get1/{cname}")
	public List<Customer> findByName(@PathVariable String cname)
	{
		return serviceInterface.findByName(cname);
	}
	@GetMapping("/get2/{cid}")
	public List<Orders> findByID(@PathVariable int cid)
	{
		return serviceInterface.findByID(cid);
	}
	@PutMapping("/update/{cid}")
	public String saveCus(@RequestBody Customer customer,@PathVariable int cid)
	{
		 serviceInterface.saveCus(customer,cid);
		 return "updated";
	}
	
}
