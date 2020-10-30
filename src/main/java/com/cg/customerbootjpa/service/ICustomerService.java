package com.cg.customerbootjpa.service;

import com.cg.customerbootjpa.entities.Customer;

public interface ICustomerService {
	public Customer register(Customer customer);
	public Customer updateName(long id, String name);

}
