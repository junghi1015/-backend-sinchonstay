package com.example.catbellrow.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/simple")
public class RowSearchController {

    @GetMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_VALUE})
    public void simpleTest(){
        System.out.println("test");
    }
}
