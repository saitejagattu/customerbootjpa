package com.cg.customerbootjpa.repository;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.customerbootjpa.entities.Customer;

@Repository
public class CustomerRepositoryImpl implements ICustomerRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Customer add(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		
		return entityManager.merge(customer);
	}
	
	@Override
	public Customer findById(long id)
	{
		return entityManager.find(Customer.class,id);
	}
}
