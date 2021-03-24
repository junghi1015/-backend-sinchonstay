package com.project.sinchon.controller;

import com.project.sinchon.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *
 * title : 컨트롤러
 * author : 정효인
 * date : 2021.03.24
 *
 * */

@RestController
@RequestMapping(value = "/")
public class SinchonController {

    @Autowired
    private sinchonService sinchonService;

    /**
     * @description 방 리스트 출력
     */
    @GetMapping(value = "/roomlist", produces = {MediaType.APPLICATION_JSON_VALUE})
    //ResponseEntity 는 HTTP 요청(Request) 또는 응답(Response)에 해당하는 HttpHeader와 HttpBody를 포함하는 클래스이다.
    public List<MemberOfCongressManVO> simpleTest() throws Exception{

        return memberOfCongressService.getCongMember();
    }

    @GetMapping(value = "/test", produces = {MediaType.APPLICATION_JSON_VALUE})
    public TestVO simpleTest() throws Exception{
        TestVO vo = new TestVO();
        vo.setParam1("톄쓰트1");
        vo.setParam2("톄쓰트2");
        return vo;
    }



}
