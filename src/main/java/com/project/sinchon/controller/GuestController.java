package com.project.sinchon.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.project.sinchon.service.RoomService;

import com.project.sinchon.vo.reservationVO;
import com.project.sinchon.vo.reviewVO;
import com.project.sinchon.vo.roomVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

/*
 *
 * title : Guest관련 컨트롤러
 * author : 여인준
 * create date : 2021.04.03
 * update 
 * 2021.04.11 : 여인준 / 예약가능한 방 기본값 및 사용자 입력값에 따라 조회 API 구현
 * 2021.04.12 : 여인준 / 예약신청 폼 이동시 날짜값 반환 API 구현 (DB작업 X)
 * */

@RestController
@RequestMapping(value = "/*")
public class GuestController {
    
    @Autowired // 확인사항 : Inject과 차이
    private RoomService roomService;
    

    /**
     * @description 예약 가능한 방 목록 조회 (접속일 기준 1박2일로 예약가능한 방 조회)
     */
    @GetMapping(value = "/rooms", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<roomVO> roomList() throws Exception{
        return roomService.getList();
    }
    
    
    /**
     * @description 예약 가능한 방 목록 조회 (사용자 입력값에 따라 출력)
     */
    @GetMapping(value = "/rooms/search", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<roomVO> roomSearchList(@RequestParam("check_in") String checkIn,
    									@RequestParam("check_out") String checkOut) throws Exception{
    	// 사용자가 입력한 날짜를 담을 map객체 생성
    	HashMap<String, Date> dateMap = new HashMap<String, Date>();
        
    	// 사용자 입력 날짜 자료형 변형(String to Date)
    	Date dateCheckIn = Date.valueOf(checkIn);
        Date dateCheckOut = Date.valueOf(checkOut);
        
        // 입력받은 날짜 map객체에 담아주기
        dateMap.put("checkIn", dateCheckIn);
        dateMap.put("checkOut", dateCheckOut);
    	
        // Service 레이어 호출시 입력받은 날짜가 담긴 dateMap을 인자로 넣어서 호출
    	return roomService.getSearchList(dateMap);
    }


    /**
     * @description 예약신청 폼(form) 화면으로 이동(예약하기 페이지에서 선택한 check_in, check_out 값 넘겨주기)
     */
    @GetMapping(value = "/reservation", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String reservationForm(@RequestParam("check_in") String checkIn,
    							  @RequestParam("check_out") String checkOut) throws Exception{
    	// Gson모듈내 JSON클래스의 객체 생성
    	JsonObject dateObj = new JsonObject();
    	
    	// URL로 받은 check_in 과 check_out 값 JSON으로 다시 넘겨주기
    	dateObj.addProperty("check_in", checkIn);
    	dateObj.addProperty("check_out", checkOut);
        
        // JSON객체를 String으로 반환 
    	return dateObj.toString();
    }


}// End
