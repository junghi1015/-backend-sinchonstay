package com.project.sinchon.vo;

import lombok.Data;

import java.util.Date;

/**
 * title : 예약정보 테이블 VO
 * author : 정효인
 * create_date : 2021.03.24
 * update 
 * 2021.04.21 : 여인준 / 결제금액(payment) 속성 추가, join테이블 VO 속성 추가
 *
 * */
@Data
public class ReservationInfoVO {
    private int res_ID;
    private Date res_date;
    private Date check_in;
    private Date check_out;
    private String stay_purpose;
    private int num_of_guests;
    private String message;
    private int payment;
    private String user_ID;
    private int room_ID;
    private int state; // (임시) 예약상태 테이블의 state속성 값 받아주는 변수
    
    // join 데이터 받아올 객체 속성 추가
    private userVO userVO;
    private ReservationStateVO resStateVO;
    
}
