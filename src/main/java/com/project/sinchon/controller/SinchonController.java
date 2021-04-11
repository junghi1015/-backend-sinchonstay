package com.project.sinchon.controller;

import com.project.sinchon.service.SinchonService;

import com.project.sinchon.vo.reservationVO;
import com.project.sinchon.vo.reviewVO;
import com.project.sinchon.vo.roomVO;
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
    private SinchonService SinchonService;

    /**
     * @description 방 리스트 출력
     */
    @GetMapping(value = "/roomlist", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<roomVO> getRoomList() throws Exception{

        return SinchonService.getRoomList();
    }

    /**
     * @description 리뷰 리스트 출력
     */
    @GetMapping(value = "/reviewlist", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<reviewVO> getReviewList() throws Exception{

        return SinchonService.getReviewList();
    }

    /**
     * @description 관리자 페이지 고객관리 - 최근 예약순
     */
    @GetMapping(value = "/host_guest_manage", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<reservationVO> getResManage() throws Exception{

        return SinchonService.getResManage();
    }




}
