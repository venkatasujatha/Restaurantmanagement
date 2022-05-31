package com.example.demo.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.OrderComparator.OrderSourceProvider;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Customer;
import com.example.demo.Model.Orders;
import com.example.demo.Model.Restaurant;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Repository.OrdersRepository;
import com.example.demo.Repository.RestaurantRepository;

@Service
public class ResturantServiceImpl implements ServiceInterface{
	
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private OrdersRepository ordersRepository;

	@Override
	public Restaurant addRess(Restaurant restaurant) {
		
		return restaurantRepository.save(restaurant);
	}

		@Override
	public List<Restaurant> findAllDetails(String rname) {
		List<Restaurant> findAll = restaurantRepository.findAll();
		return findAll;
	}

		@Override
		public List<Customer> findByName(String cname) {
			
			return customerRepository.findAll();
		}

		@Override
		public List<Orders> findByID(int cid) {
			
			 List<Orders> findAll = ordersRepository.findAll();
			 return findAll;
		}

		@Override
		public Customer saveCus(Customer customer,int cid) {
			
			Optional<Customer> list = customerRepository.findById(cid);
			System.out.println(customer.getCname());
			String cname = list.get().getCname();
		    return customerRepository.save(customer);
			
				
		}

		@Override
		public Customer saveCus(int cid) {
			// TODO Auto-generated method stub
			return null;
		}


	
	

}
