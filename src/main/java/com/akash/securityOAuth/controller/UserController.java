package com.akash.securityOAuth.controller;

import com.akash.securityOAuth.urlMapping.UrlMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

   /* @GetMapping(value = UrlMapping.DEMO)
    public ResponseEntity<Object> getObject(){

        return new ResponseEntity<>("", HttpStatus.ACCEPTED);
    }*/

    @GetMapping(value = UrlMapping.DEMO)
    public String getObject(){

        return "Hello";
    }
}
