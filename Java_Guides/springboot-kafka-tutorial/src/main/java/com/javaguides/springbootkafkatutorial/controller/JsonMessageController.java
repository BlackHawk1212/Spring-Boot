package com.javaguides.springbootkafkatutorial.controller;

import com.javaguides.springbootkafkatutorial.kafka.JsonKafkaProducer;
import com.javaguides.springbootkafkatutorial.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    //    http://localhost:8079/api/v1/kafka/json/publish
    @PostMapping("/json/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to the topic");
    }

}
