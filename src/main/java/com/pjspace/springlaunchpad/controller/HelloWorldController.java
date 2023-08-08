package com.pjspace.springlaunchpad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjspace.springlaunchpad.service.HelloWorldService;

@RequestMapping("/helloworld")
@Controller
public class HelloWorldController {
    @Autowired
    private HelloWorldService hiService;
    
    @GetMapping("/")
    public ResponseEntity<String> salutations() {
        System.out.println("hello");
        return new ResponseEntity<String>(hiService.hello(), HttpStatus.OK);
    }
}
