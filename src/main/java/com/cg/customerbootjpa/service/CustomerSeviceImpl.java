package com.cg.customerbootjpa.service;

import com.cg.customerbootjpa.entities.Customer;
import com.cg.customerbootjpa.repository.ICustomerRepository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerSeviceImpl implements ICustomerService{

	
	@Autowired
	private ICustomerRepository repository;
	
	@Transactional
	@Override
	public Customer register(Customer customer) {
	    customer = repository.add(customer);
		return customer;
		
		
	}

	@Override
	public Customer updateName(long id, String name) {
		Customer customer = repository.findById(id);
		customer.setName(name);
		return repository.update(customer);
		
	}

	
	

}
