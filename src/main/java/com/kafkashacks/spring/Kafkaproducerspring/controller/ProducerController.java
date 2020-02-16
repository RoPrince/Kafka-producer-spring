package com.kafkashacks.spring.Kafkaproducerspring.controller;

import com.kafkashacks.spring.Kafkaproducerspring.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class ProducerController {

    @Autowired
    private KafkaTemplate<String, Employee> kafkaTemplate;

    private static final String TOPIC = "topic_test";

    @GetMapping("/publish/{name}")
    public String postKafkaorders(@PathVariable("name") final String name) {
        kafkaTemplate.send(TOPIC, new Employee("123",name));
        return "Message posted";
    }
}
