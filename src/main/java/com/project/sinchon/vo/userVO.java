package com.project.sinchon.vo;

/**
 * title : 유저 getter/setter
 * author : 정효인
 * date : 2021.03.24
 *
 * */

public class userVO {
    private String user_ID;
    private String pwd;
    private String email;
    private String reg_date;
    private String update_date;
    private boolean ishost;

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public boolean isIshost() {
        return ishost;
    }

    public void setIshost(boolean ishost) {
        this.ishost = ishost;
    }
}
