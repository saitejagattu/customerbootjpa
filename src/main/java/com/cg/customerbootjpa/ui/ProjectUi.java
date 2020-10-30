package com.cg.customerbootjpa.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.customerbootjpa.entities.Customer;
import com.cg.customerbootjpa.service.ICustomerService;

@Component
public class ProjectUi {
	@Autowired
	private ICustomerService service;
		public void run()
		{
			Customer c=new Customer();
			c.setId(100L);
			c.setName("Raju");
			Customer c1=new Customer();
			c1.setId(110L);
			c1.setName("suresh");
			service.register(c);
			service.register(c1);
	
		}
		public Customer add(long id,String name){
			Customer customer = new Customer(id, name);
			customer = service.register(customer);
			return customer;
		}
		public Customer update(Long id, String newName)
		{
			return service.updateName(id, newName);
		}
		
		

	}

