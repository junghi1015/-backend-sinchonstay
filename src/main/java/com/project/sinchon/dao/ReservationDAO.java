package com.project.sinchon.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.sinchon.vo.ApplyReservationVO;

/*
*
* title : 예약관련 DAO 레이어 
* author : 여인준
* create date : 2021.04.14
* update 
* 2021.04.14 : 여인준 / 사용자가 입력한 예약정보 DB에 저장
* 2021.04.17 : 여인준 / insertRoomAndState 메소드 생성(프로시저 호출)
* */

@Repository
public class ReservationDAO {
    @Autowired
    private SqlSession sqlSession;
    private static final String namespace = "com.project.sinchon.mapper.reservation";
	
	// 예약정보 테이블 insert
	public int insertInfo(ApplyReservationVO applyReservationVO) {
		return sqlSession.insert(namespace + ".insertInfo", applyReservationVO);
	}

	// 예약된 방 테이블, 예약상태 테이블 insert >> insert_room_and_state 프로시저 호출
	public void insertRoomAndState(HashMap<String, Object> map) {
		sqlSession.insert(namespace + ".insertRoomAndState", map);
		
	}

}
