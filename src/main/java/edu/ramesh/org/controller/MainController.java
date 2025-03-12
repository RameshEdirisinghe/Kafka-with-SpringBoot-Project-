package edu.ramesh.org.controller;

import edu.ramesh.org.dto.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final KafkaTemplate<String,Book> kafkaTemplate;
    private static final String Topic ="NewTopic";

    @PostMapping("/msg")
    public String testMessage(@RequestBody Book book){
        kafkaTemplate.send(Topic,book);
        return "Published Successfully!";
    }
}
