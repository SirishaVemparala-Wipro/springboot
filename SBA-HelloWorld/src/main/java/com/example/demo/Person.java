package com.example.demo;

import java.util.Optional;

import org.springframework.data.repository.Repository;

import jakarta.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    interface PersonRepository extends Repository<Person, Long> {

    	  Person save(Person person);

    	  Optional<Person> findById(long id);
    	}
    
}
