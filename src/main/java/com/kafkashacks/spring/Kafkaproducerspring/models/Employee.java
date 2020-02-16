package com.kafkashacks.spring.Kafkaproducerspring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    @JsonProperty()
    private String id;

    @JsonProperty()
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
