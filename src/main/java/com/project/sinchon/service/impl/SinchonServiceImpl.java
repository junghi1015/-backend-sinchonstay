package com.project.sinchon.service.impl;

import com.project.sinchon.dao.SinchonDao;
import com.project.sinchon.service.sinchonService;
import com.project.sinchon.vo.MemberOfCongressManVO;
import com.project.sinchon.vo.MemberVO;
import com.project.sinchon.vo.RawContentsVO;
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
public class SinchonServiceImpl implements sinchonService {

    @Autowired
    private SinchonDao sinchonDao;


    /**
     * @description 국회의원 리스트 출력
     */
    @Override
    public List<MemberOfCongressManVO> getCongMember() throws Exception {

        return sinchonDao.getCongMember();
    }

    /**
     * @description 법안 리스트 출력
     */
    @Override
    public List<RawContentsVO> getRawList() throws Exception {
        return sinchonDao.getRawList();
    }
    /**
     * @description 법안 조회 리스트 결과 카운트
     */
    @Override
    public int rawListCount() throws Exception {
        return sinchonDao.rawListCount();
    }

    /**
     * @description 검색 결과 조회
     */
    @Override
    public List<RawContentsVO> rawListSearch(String keyword) throws Exception {
        return sinchonDao.rawListSearch(keyword);
    }

    /**
     * @description 로그인 조회
     */
    @Override
    public int login(MemberVO vo) throws Exception {
        return sinchonDao.login(vo);
    }

    /**
     * @description 최신순 법안 조회
     */
    @Override
    public List<RawContentsVO> rawListUptodate(String pram) throws Exception {
        return sinchonDao.rawListUptodate(pram);
    }

    /**
     * @description 사이드 버튼 조회
     */
    @Override
    public List<RawContentsVO> subListSearch(String pram) throws Exception {
        return sinchonDao.subListSearch(pram);
    }

    /**
     * @description 대수만으로 조회
     */
    @Override
    public List<RawContentsVO> rawListSeason(String pram) throws Exception {
        return sinchonDao.rawListSeason(pram);
    }

    /**
     * @description 대수+ 키워드로 조회
     */
    @Override
    public List<RawContentsVO> rawListAll(RawContentsVO vo) throws Exception {
        return sinchonDao.rawListAll(vo);
    }


}
