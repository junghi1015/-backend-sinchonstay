package com.project.sinchon.vo;

/**
 * title : sns로그인 getter/setter
 * author : 정효인
 * date : 2021.03.24
 *
 * */

public class sns_loginVO {
    private String SNS_ID;
    private String SNS_type;

    public String getSNS_ID() {
        return SNS_ID;
    }

    public void setSNS_ID(String SNS_ID) {
        this.SNS_ID = SNS_ID;
    }

    public String getSNS_type() {
        return SNS_type;
    }

    public void setSNS_type(String SNS_type) {
        this.SNS_type = SNS_type;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    private String user_ID;

}
