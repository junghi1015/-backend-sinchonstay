package com.project.sinchon.service;

import java.util.HashMap;
import java.util.List;

import com.project.sinchon.vo.ReservationInfoVO;


/*
*
* title : 예약관련 서비스 레이어 인터페이스
* author : 여인준
* create date : 2021.04.21
* update 
* 
* */

public interface ReservationService {
	 /**
     * @param map 
	 * @description 사용자가 예약한 예약현황 및 상태 정보 가져오기 
     */
	List<ReservationInfoVO> getMypageList(HashMap<String, String> map) throws Exception;
}
