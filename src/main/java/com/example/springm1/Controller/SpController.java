package com.example.springm1.Controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SpController {

    @GetMapping(path = "/", produces = "application/json")
    public HttpEntity<String> findAllCourse() {
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
