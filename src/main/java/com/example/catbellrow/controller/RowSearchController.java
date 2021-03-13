package com.example.catbellrow.controller;

import com.example.catbellrow.service.MemberOfCongressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/raws")
public class RowSearchController {

    @Autowired
    private MemberOfCongressService memberOfCongressService;

    // value는 프론트에서 접근하려는 주소, produces는 데이터 교류 타입을 지정(json)
    @GetMapping(value = "/memberCong", produces = {MediaType.APPLICATION_JSON_VALUE})

    //ResponseEntity 는 HTTP 요청(Request) 또는 응답(Response)에 해당하는 HttpHeader와 HttpBody를 포함하는 클래스이다.
    public void simpleTest() throws Exception{

        System.out.println(memberOfCongressService.getCongMember());
    }
}
