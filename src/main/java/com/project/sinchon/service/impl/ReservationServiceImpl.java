package com.project.sinchon.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sinchon.dao.ReservationDAO;
import com.project.sinchon.service.ReservationService;
import com.project.sinchon.vo.ReservationInfoVO;

/*
*
* title : 예약관련 서비스Impl 레이어 
* author : 여인준
* create date : 2021.04.14
* update 
* */

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationDAO reservationDAO;

	@Override
	public List<ReservationInfoVO> getMypageList(HashMap<String, String> map) throws Exception {
		return reservationDAO.getMypageList(map);
	}
	
}
