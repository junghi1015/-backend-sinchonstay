package com.project.sinchon.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.project.sinchon.service.ApplyReservaionService;
import com.project.sinchon.service.RoomService;
import com.project.sinchon.vo.ApplyReservationVO;
import com.project.sinchon.vo.reservationVO;
import com.project.sinchon.vo.reviewVO;
import com.project.sinchon.vo.roomVO;
import com.project.sinchon.vo.sns_loginVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *
 * title : Guest관련 컨트롤러
 * author : 여인준
 * create date : 2021.04.03
 * update 
 * 2021.04.11 : 여인준 / 예약가능한 방 기본값 및 사용자 입력값에 따라 조회 API 구현
 * 2021.04.12 : 여인준 / 예약신청 폼 이동시 날짜값 반환 API 구현 (DB작업 X)
 * 2021.04.14 : 여인준 / 예약하기 API 구현(post 메소드, DB insert)
 * 2021.04.17 : 여인준 / POST /reservation 예약신청 정보 DB저장 Controller 구현 완료 
 * 2021.04.17 : 여인준 / 예약신청 폼화면으로 이동 요청 메소드 변경 (GET에서 POST로)
 * */

@RestController
@RequestMapping(value = "/*")
public class GuestController {
    
    @Autowired // 확인사항 : Inject과 차이
    private RoomService roomService;
    
    @Autowired
    private ApplyReservaionService applyReservationService;
    

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
     * @description 예약신청 폼(form) 화면으로 이동
     *  <21.04.17 수정사항>
     * 1. 예약하기 페이지에서 선택한 check_in, check_out 값 POST로 넘겨주기
     * 
     *  <수정 예정사항>
     * 2. 예약정보가 있다면 회원정보 데이터를 같이 보내주기 (User Table에 회원정보 입력여부 컬럼 추가)
     */
    @PostMapping(value = "/reservation/form", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String reservationForm(@RequestBody Map<String, Object> dateInOut ) throws Exception{
    	// POST방식으로 받은 JSON 데이터 Map으로 받기 
    	// Map으로 받은 데이터 JSON형태로 변환 : Gson모듈내 JSON클래스 활용
    	JsonObject jsonObj = new JsonObject();
    	
    	// Map으로 받은 check_in값 과 check_out값 JSON으로 다시 넘겨주기
    	jsonObj.addProperty("check_in", (String) dateInOut.get("check_in"));
    	jsonObj.addProperty("check_out", (String) dateInOut.get("check_out"));
    	
    	// 회원 아이디로 회원저
        // JSON객체를 String으로 반환 
    	return jsonObj.toString();
    }

    /**
     * @throws Exception 
     * @description 예약신청 폼(form) 작성해서 예약신청하기
     * 프론트엔드와 통신시 RequestBody의 데이터 형태 확인
     */
    @PostMapping(value = "/reservation", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void reservation(@RequestBody ApplyReservationVO applyReservationVO) throws Exception {
    	// 사용자 입력 데이터가 JSON형태로 들어와서
    	// @RequestBody를 거쳐서 VO객체의 변수들과 매핑됨
    	// 매핑된 VO객체를 Service레이어의 인자값으로 넘겨줌
    	applyReservationService.insertReservation(applyReservationVO);
    }
    

}// End
