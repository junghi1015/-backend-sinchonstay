package com.project.sinchon.vo;

/**
 * title : 예약 getter/setter
 * author : 정효인
 * date : 2021.03.24
 *
 * */

public class reservationVO {
    private int res_ID;
    private date res_date;
    private date stay_start_day;
    private date stay_end_day;
    private int res_state;
    private String res_firstname;
    private String res_lastname;
    private int sex;
    private String country;

    public int getRes_ID() {
        return res_ID;
    }

    public void setRes_ID(int res_ID) {
        this.res_ID = res_ID;
    }

    public date getRes_date() {
        return res_date;
    }

    public void setRes_date(date res_date) {
        this.res_date = res_date;
    }

    public date getStay_start_day() {
        return stay_start_day;
    }

    public void setStay_start_day(date stay_start_day) {
        this.stay_start_day = stay_start_day;
    }

    public date getStay_end_day() {
        return stay_end_day;
    }

    public void setStay_end_day(date stay_end_day) {
        this.stay_end_day = stay_end_day;
    }

    public int getRes_state() {
        return res_state;
    }

    public void setRes_state(int res_state) {
        this.res_state = res_state;
    }

    public String getRes_firstname() {
        return res_firstname;
    }

    public void setRes_firstname(String res_firstname) {
        this.res_firstname = res_firstname;
    }

    public String getRes_lastname() {
        return res_lastname;
    }

    public void setRes_lastname(String res_lastname) {
        this.res_lastname = res_lastname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge_group() {
        return age_group;
    }

    public void setAge_group(int age_group) {
        this.age_group = age_group;
    }

    public String getStay_purpose() {
        return stay_purpose;
    }

    public void setStay_purpose(String stay_purpose) {
        this.stay_purpose = stay_purpose;
    }

    public int getNum_of_guests() {
        return num_of_guests;
    }

    public void setNum_of_guests(int num_of_guests) {
        this.num_of_guests = num_of_guests;
    }

    public String getNA_foods() {
        return NA_foods;
    }

    public void setNA_foods(String NA_foods) {
        this.NA_foods = NA_foods;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public int getRoom_ID() {
        return room_ID;
    }

    public void setRoom_ID(int room_ID) {
        this.room_ID = room_ID;
    }

    private int age_group;
    private String stay_purpose;
    private int num_of_guests;
    private String NA_foods;
    private String etc;
    private String user_ID;
    private int room_ID;

}
