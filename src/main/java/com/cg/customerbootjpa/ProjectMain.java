package com.cg.customerbootjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cg.customerbootjpa.ui.ProjectUi;
@EnableTransactionManagement
@SpringBootApplication
public class ProjectMain {
	
	 public static void main(String args[]) {
	        ConfigurableApplicationContext context = SpringApplication.run(ProjectMain.class, args);
	        ProjectUi ui = context.getBean(ProjectUi.class);
	        ui.run();
	        context.close();
	    }

}
