package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.telusko.model.Employee;
import com.telusko.repo.IEmployeeRepo;
@Component
public class DataJpa1 implements CommandLineRunner {
	@Autowired
	private IEmployeeRepo repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Employee(1,"Praneetha","Hyderabad"));
	}

}
