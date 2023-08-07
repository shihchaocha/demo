package com.example.demo;

import com.example.demo.model.CountResponse;
import com.example.demo.model.StringResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//test
@RestController
public class HomeController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }
    @RequestMapping(value = "/status", method = RequestMethod.GET, produces = 	MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StringResponse> healthcheck() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new StringResponse("OK - healthy"));
    }
    @RequestMapping(value = "/metrics", method = RequestMethod.GET, produces = 	MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CountResponse> metrics() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new CountResponse("success",0,100,20));
    }
}

