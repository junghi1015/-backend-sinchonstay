package com.project.sinchon.service;

import com.project.sinchon.vo.reviewVO;
import com.project.sinchon.vo.roomVO;

import java.util.List;

/*
 *
 * title : mvc 서비스 구간
 * author : 정효인
 * date : 2021.03.14
 *
 * */


//인터페이스 ::: 서비스 추상화 구간 (자세한 로직은 impl파일에서 정의한다 (@override))
public interface SinchonService {

     /**
      * @description 방 리스트 출력
      */
     List<roomVO> getRoomList() throws Exception;

     /**
      * @description 리뷰 리스트 출력
      */
     List<reviewVO> getReviewList() throws Exception;


}
