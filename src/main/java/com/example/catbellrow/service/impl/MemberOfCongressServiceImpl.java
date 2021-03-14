package com.example.catbellrow.service.impl;

import com.example.catbellrow.dao.MemberDao;
import com.example.catbellrow.service.MemberOfCongressService;
import com.example.catbellrow.vo.MemberOfCongressManVO;
import com.example.catbellrow.vo.MemberVO;
import com.example.catbellrow.vo.RawContentsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


// service 의 추상화(간소화)된 메서드를 자세하게 정의해야하는 구간
@Service
public class MemberOfCongressServiceImpl implements MemberOfCongressService {

    @Autowired
    private MemberDao memberDao;


    /**
     * @description 국회의원 리스트 출력
     */
    @Override
    public List<MemberOfCongressManVO> getCongMember() throws Exception {

        return memberDao.getCongMember();
    }

    /**
     * @description 법안 리스트 출력
     */
    @Override
    public List<RawContentsVO> getRawList() throws Exception {
        return memberDao.getRawList();
    }
    /**
     * @description 법안 조회 리스트 결과 카운트
     */
    @Override
    public int rawListCount() throws Exception {
        return memberDao.rawListCount();
    }

    /**
     * @description 검색 결과 조회
     */
    @Override
    public List<RawContentsVO> rawListSearch(String keyword) throws Exception {
        return memberDao.rawListSearch(keyword);
    }

    /**
     * @description 로그인 조회
     */
    @Override
    public int login(MemberVO vo) throws Exception {
        return memberDao.login(vo);
    }

    /**
     * @description 최신순 법안 조회
     */
    @Override
    public List<RawContentsVO> rawListUptodate(String pram) throws Exception {
        return memberDao.rawListUptodate(pram);
    }

}
