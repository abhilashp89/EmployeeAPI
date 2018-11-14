package com.abhi.spring.data.rest.repos;

import org.springframework.data.repository.CrudRepository;

import com.abhi.spring.data.rest.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
