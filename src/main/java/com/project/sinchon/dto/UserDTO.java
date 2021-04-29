package com.project.sinchon.dto;

import lombok.Data;

import java.util.Date;

/**
 * title : User 테이블 DTO
 * author : 정효인
 * date : 2021.03.24
 *
 * */
@Data
public class UserDTO {
    private String user_ID;
    private String pwd;
    private String email;
    private Date reg_date;
    private Date update_date;
    private boolean ishost;
    private String firstname;
    private String lastname;
    private int sex;
    private String country;
    private int age_group;
    private String NA_foods;

}