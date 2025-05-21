package com.example.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbitmq.service.MessageProducer;

@RestController
@RequestMapping("/api")
public class ProducerController {

    @Autowired
    private MessageProducer producer;

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody String message) {
        return ResponseEntity.ok(producer.sendMessage(message));
    }
}
