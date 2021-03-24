package com.project.sinchon.service;

import com.project.sinchon.vo.MemberOfCongressManVO;
import com.project.sinchon.vo.MemberVO;
import com.project.sinchon.vo.RawContentsVO;

import java.util.List;

/*
 *
 * title : mvc 서비스 구간
 * author : 정효인
 * date : 2021.03.14
 *
 * */


//인터페이스 ::: 서비스 추상화 구간 (자세한 로직은 impl파일에서 정의한다 (@override))
public interface sinchonService {

     /**
      * @description 국회의원 리스트 출력
      */
     List<MemberOfCongressManVO> getCongMember() throws Exception;

     /**
      * @description 법안 리스트 출력
      */
     List<RawContentsVO> getRawList() throws Exception;

     /**
      * @description 법안 조회 리스트 결과 카운트
      */
     int rawListCount() throws Exception;

     /**
      * @description 검색 결과 조회
      */
     List<RawContentsVO> rawListSearch(String keyword) throws Exception;

     /**
      * @description 로그인 / 유저 조회
      */
     int login(MemberVO vo) throws Exception;

     /**
      * @description 최신순 법안 조회
      */
     List<RawContentsVO> rawListUptodate(String pram) throws Exception;

     /**
      * @description 사이드 버튼 조회
      */
     List<RawContentsVO> subListSearch(String pram) throws Exception;

     /**
      * @description 대수만으로 조회
      */
     List<RawContentsVO> rawListSeason(String pram) throws Exception;

     /**
      * @description 대수 + 키워드 조회
      */
     List<RawContentsVO> rawListAll(RawContentsVO vo) throws Exception;
}
