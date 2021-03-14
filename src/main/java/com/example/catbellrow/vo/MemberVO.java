package com.example.catbellrow.vo;

/*
 *
 * title : 회원 getter/setter
 * author : 정효인
 * date : 2021.03.13
 *
 * */

public class MemberVO {
    private int member_code;
    private String member_id;
    private String pwd;
    private String email;

    public int getMember_code() {
        return member_code;
    }

    public void setMember_code(int member_code) {
        this.member_code = member_code;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
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
}
