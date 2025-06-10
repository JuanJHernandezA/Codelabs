package com.ejemplo.rabbitmq.controller;

import com.ejemplo.rabbitmq.service.RabbitMQProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rabbitmq")
public class RabbitMQController {

    private final RabbitMQProducer producer;

    public RabbitMQController(RabbitMQProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/send/{message}")
    public String sendMessage(@PathVariable String message) {
        producer.sendMessage(message);
        return "Mensaje enviado a RabbitMQ: " + message;
    }
}
