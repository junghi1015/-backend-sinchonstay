package com.project.sinchon.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.sinchon.vo.ApplyReservationVO;

/*
*
* title : 사용자관련 DAO 레이어 
* author : 여인준
* create date : 2021.04.14
* update 
* 2021.04.14 : 여인준 / 예약신청시 회원이 입력한 데이터를 기준으로 회원정보 수정(update) 
* 
* */

@Repository
public class UserDAO {
    @Autowired
    private SqlSession sqlSession;
    private static final String namespace = "com.project.sinchon";
    
	public void updateUserDetails(ApplyReservationVO applyReservationVO) {
		sqlSession.update(namespace + ".updateUserDetails", applyReservationVO);
		
	}

}