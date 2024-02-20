package com.example.zadanie2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class API {

    @PostMapping("/problems/217")
    public RepetitiveArrayChecker postResponse(@RequestBody RepetitiveArrayChecker repetitiveArrayChecker){
        repetitiveArrayChecker.checkIfRepetitiveElements();
        return repetitiveArrayChecker;
    }

}