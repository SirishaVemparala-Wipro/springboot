package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;//provides built-in CRUD (Create, Read, Update, Delete) operations.

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);//returns a list of Customer objects with the given last name.

  Customer findById(long id);//finds customer by id
}