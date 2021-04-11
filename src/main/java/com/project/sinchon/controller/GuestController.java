package com.project.sinchon.controller;

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
 *
 * */

@RestController
@RequestMapping(value = "/*")
public class GuestController {
    
    @Autowired // 확인사항 : Inject과 차이
    private RoomService roomService;
    

    /**
     * @description 예약 가능한 방 목록 조회 
     * @description (기본값 : 접속일 기준 1박2일로 예약가능한 방 조회)
     */
    @GetMapping(value = "/rooms", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<roomVO> roomList() throws Exception{
        return roomService.getList();
    }
    
    /**
     * @description 예약 가능한 방 목록 조회(사용자 입력값에 따라 출력)
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



}// End
