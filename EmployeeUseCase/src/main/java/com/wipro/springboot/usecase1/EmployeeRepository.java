package com.wipro.springboot.usecase1;
//this interface provides methods to interact with db

import java.util.List;

import org.springframework.data.repository.CrudRepository;

interface EmployeeRepository extends CrudRepository<Employee, Long> {//provides CRUD operations
    List<Employee> findByRole(String role);//retrieves list of employees based on role
    Employee findById(long id);//retrieves employee by id
}
