package com.example.catbellrow.controller;

import com.example.catbellrow.service.MemberOfCongressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/simple")
public class RowSearchController {

    @Autowired
    private MemberOfCongressService memberOfCongressService;

    @GetMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_VALUE})
    public void simpleTest(){
        System.out.println(memberOfCongressService.getCongMember());
    }
}
