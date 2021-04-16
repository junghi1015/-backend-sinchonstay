package com.project.sinchon.service;

import java.util.List;

import com.project.sinchon.vo.ApplyReservationVO;
import com.project.sinchon.vo.roomVO;

/*
*
* title : 예약신청 서비스 레이어 인터페이스
* author : 여인준
* create date : 2021.04.14
* update 
* 2021.04.14 : 여인준 / 사용자가 입력한 예약정보 DB에 저장
* 
* */

public interface ApplyReservaionService {
	 /**
     * @param applyReservationVO 
	 * @description 사용자가 입력한 예약정보 DB에 저장
     */
	public void insertReservation(ApplyReservationVO applyReservationVO) throws Exception;
}
