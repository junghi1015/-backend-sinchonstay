package com.project.sinchon.vo;

import java.util.Date;

import lombok.Data;

/**
 * title : 예약상태 테이블 VO
 * author : 여인준
 * create_date : 2021.04.21
 * update 
 * 
 * */
@Data
public class ReservationStateVO {
	int res_ID;
	String user_ID;
	int state; // 1 : 예약신청, 2 : 예약확정, 3 : 예약취소
	Date apply_date;
	Date confirm_date;
}
