package com.wipro.springboot.usecase1;
/*Design and develop a spring boot project that will update the employee data
If a new joinee comes in and the employee is developer then the employee with get the designation developer*/
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//DB auto-generates the id for each new record
    private Long id;
    private String name;
    private String role;
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    protected Employee() {}//default constructor

    public Employee(String name, String role) {//parameterized constructor to initialize the obj
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {//print employee details
        return String.format("Employee[id=%d, name='%s', role='%s']", id, name, role);
    }

    
}
