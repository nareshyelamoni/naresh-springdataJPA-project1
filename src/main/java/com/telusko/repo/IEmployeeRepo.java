package com.telusko.repo;

import org.springframework.data.repository.CrudRepository;

import com.telusko.model.Employee;

public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {

}
