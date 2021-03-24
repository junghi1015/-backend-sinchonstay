package com.project.sinchon.service.impl;

import com.project.sinchon.dao.SinchonDao;
import com.project.sinchon.service.SinchonService;
import com.project.sinchon.vo.reviewVO;
import com.project.sinchon.vo.roomVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *
 * title : 서비스 추상화 푸는 구간
 * author : 정효인
 * date : 2021.03.14
 *
 * */

// service 의 추상화(간소화)된 메서드를 자세하게 정의해야하는 구간
@Service
public class SinchonServiceImpl implements SinchonService {

    @Autowired
    private SinchonDao SinchonDao;

    /**
     * @description 방 리스트 출력
     */
    @Override
    public List<roomVO> getRoomList() throws Exception {

        return SinchonDao.getRoomList();
    }

    /**
     * @description 리뷰 리스트 출력
     */
    @Override
    public List<reviewVO> getReviewList() throws Exception {

        return SinchonDao.getReviewList();
    }

}
