package com.github.kafkasendertest.controller;

import com.github.kafkasendertest.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SenderController {

    @Autowired
    private KafkaTemplate<Long, EmployeeDTO> kafkaTemplate;

    @PostMapping("/{id}")
    public void sendEmployeeInfo(@PathVariable Long id, @RequestBody EmployeeDTO employee) {
        ListenableFuture<SendResult<Long, EmployeeDTO>> future = kafkaTemplate.send("employee", id, employee);
        future.addCallback(System.out::println, System.err::println);
        kafkaTemplate.flush();
    }
}
