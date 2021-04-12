package com.project.sinchon.dao;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import com.project.sinchon.vo.*;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.sinchon.vo.roomVO;

/*
*
* title : DB에 접근하는 layer(room 테이블)
* author : 여인준
* create date : 2021.04.03
* update : -
* 
* */

@Repository
public class RoomDAO {
	
    @Autowired
    private SqlSession sqlSession;
    private static final String namespace = "com.project.sinchon";
    
	 /**
     * @description 예약가능한 방 리스트 출력 예약가능한 방 리스트 출력(기본값 : 접속일 기준 1박2일로 예약가능한 방 조회)
     */
	public List<roomVO> getList() {
        return sqlSession.selectList(namespace + ".getList");
	}

	 /**
     * @description 예약가능한 방 리스트 출력 (사용자 입력값에 따라 출력)
     */	
	public List<roomVO> getSearchList(HashMap<String, Date> dateMap) {
		return sqlSession.selectList(namespace + ".getSearchList", dateMap);
	}


}