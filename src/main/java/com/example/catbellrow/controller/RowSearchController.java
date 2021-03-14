package com.example.catbellrow.controller;

import com.example.catbellrow.service.MemberOfCongressService;
import com.example.catbellrow.vo.BillVO;
import com.example.catbellrow.vo.MemberOfCongressManVO;
import com.example.catbellrow.vo.RawContentsVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/")
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
    @GetMapping(value = "/getCongMember", produces = {MediaType.APPLICATION_JSON_VALUE})
    //ResponseEntity 는 HTTP 요청(Request) 또는 응답(Response)에 해당하는 HttpHeader와 HttpBody를 포함하는 클래스이다.
    public List<MemberOfCongressManVO> simpleTest() throws Exception{
        return memberOfCongressService.getCongMember();
    }


    /**
     * @description 법안 정보 리스트 출력
     */
    @GetMapping(value = "/rawList", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<RawContentsVO> rawList() throws Exception{
        return memberOfCongressService.getRawList();
    }

    /**
     * @description 법안 조회 리스트 결과 카운트
     */
    @GetMapping(value = "/rawListCount", produces = {MediaType.APPLICATION_JSON_VALUE})
    public int rawListCount() throws Exception{
        return memberOfCongressService.rawListCount();
    }

    /**
     * @description 검색 결과 조회
     */
    @GetMapping(value = "/rawListSearch", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<RawContentsVO> rawListSearch() throws Exception{
        return memberOfCongressService.rawListSearch();
    }

    /**
     * @description 최신순 법안 조회
     */
    @GetMapping(value = "/searchContents", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<RawContentsVO> searchContents() throws Exception{

        return memberOfCongressService.searchContents();
    }

}
