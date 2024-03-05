package com.example.GraphQLAPI.entity;

import jakarta.persistence.*;


@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;

    public Dog(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Dog(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Dog() {}

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

