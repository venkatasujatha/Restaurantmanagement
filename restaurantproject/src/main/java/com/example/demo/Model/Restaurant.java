package com.example.demo.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	@Id
	private int rid;
	private String rname;
	
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="customerid",nullable = false )
	private List<Customer> customer;


	public int getRid() {
		return rid;
	}


	public void setRid(int rid) {
		this.rid = rid;
	}


	public String getRname() {
		return rname;
	}


	public void setRname(String rname) {
		this.rname = rname;
	}


	public List<Customer> getCustomer() {
		return customer;
	}


	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}


	public Restaurant(int rid, String rname, List<Customer> customer) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.customer = customer;
	}


	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Restaurant [rid=" + rid + ", rname=" + rname + ", customer=" + customer + "]";
	}
	
	
			
}
