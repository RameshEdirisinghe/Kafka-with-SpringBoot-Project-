package edu.ramesh.org.controller;

import edu.ramesh.org.dto.Book;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    public String testMessage(@RequestBody Book book){

        return null;
    }
}
