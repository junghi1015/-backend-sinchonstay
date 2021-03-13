package com.example.catbellrow.service;

import com.example.catbellrow.vo.BillVO;
import com.example.catbellrow.vo.MemberOfCongressManVO;

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
     List<BillVO> getRaws() throws Exception;
}
