package com.cg.customerbootjpa.repository;

import com.cg.customerbootjpa.entities.Customer;

public interface ICustomerRepository {
	public Customer add(Customer customer);
	public Customer update(Customer customer);
	public Customer findById(long id);

}
