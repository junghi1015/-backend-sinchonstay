package com.project.sinchon.dao;

import com.project.sinchon.vo.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


/*
 *
 * title : data db access
 * author : 정효인
 * date : 2021.03.14
 *
 * */

//mybatis에(sql 쿼리 작성구간)에 작업을 요청하는 구간
@Repository
public class SinchonDao {

    @Autowired
    private SqlSession sqlSession;

    /**
     * @description 방 리스트 출력
     */
    public List<roomVO> getRoomList(){
        // 마지막 단어는 mybatis 아이디값, 그 나머지는 mapper namespace값
        return sqlSession.selectList( "com.project.sinchon.getRoomList");
    }

    /**
     * @description 리뷰 리스트 출력
     */
    public List<reviewVO> getReviewList(){
        return sqlSession.selectList( "com.project.sinchon.getReviewList");
    }

    /**
     * @description 관리자 페이지 고객관리 - 최근 예약순
     */
    public List<reservationVO> getResManage(){
        return sqlSession.selectList( "com.project.sinchon.getResManage");
    }

}