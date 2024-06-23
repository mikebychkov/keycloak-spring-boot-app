package com.example.keycloak;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDao {

    public List<Customer> findAll() {

        return List.of(
                Customer.builder().id(1).address("Baker Street, 15, 13").name("Sherlock LLC").serviceRendered("ADUNNO").build(),
                Customer.builder().id(2).address("Washington Street, 44, 1").name("Denzel LLC").serviceRendered("ADUNNO").build(),
                Customer.builder().id(3).address("Hong-Kong main Street, 543, 23").name("Jackie LLC").serviceRendered("ADUNNO").build(),
                Customer.builder().id(4).address("Tokio, 879, 39A").name("Saitama LLC").serviceRendered("ADUNNO").build()
        );
    }
}
