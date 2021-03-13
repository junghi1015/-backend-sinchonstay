package com.example.catbellrow.controller;

import com.example.catbellrow.service.MemberOfCongressService;
import com.example.catbellrow.vo.BillVO;
import com.example.catbellrow.vo.MemberOfCongressManVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/simple")
public class RowSearchController {

    @Autowired
    private MemberOfCongressService memberOfCongressService;


//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||



    // value는 프론트에서 접근하려는 주소, produces는 데이터 교류 타입을 지정(json)

    /**
     * @description 국회의원 전체 리스트 출력
     */
    @GetMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_VALUE})
    //ResponseEntity 는 HTTP 요청(Request) 또는 응답(Response)에 해당하는 HttpHeader와 HttpBody를 포함하는 클래스이다.
    public List<MemberOfCongressManVO> simpleTest() throws Exception{
        return memberOfCongressService.getCongMember();
    }

    /**
     * @description 법안 정보 리스트 출력
     */
    @GetMapping(value = "/getRaws", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<BillVO> getRaws() throws Exception{
        return memberOfCongressService.getRaws();
    }

}
