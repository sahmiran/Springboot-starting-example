package com.workintech.spring.spring_basics.entity;

import org.springframework.stereotype.Component;

@Component //bu yazınca bir instance oluşturacak spring
public class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

}
