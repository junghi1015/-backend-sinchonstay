package com.example.catbellrow.service;

import com.example.catbellrow.vo.MemberOfCongressManVO;
import com.example.catbellrow.vo.RawContentsVO;

import java.util.List;

//인터페이스 ::: 서비스 추상화 구간 (자세한 로직은 impl파일에서 정의한다 (@override))
public interface MemberOfCongressService{

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


}
