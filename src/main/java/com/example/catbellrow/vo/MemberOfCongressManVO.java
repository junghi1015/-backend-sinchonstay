package com.example.catbellrow.vo;
/*
 *
 * title : 국회의 getter/setter
 * author : 정효인
 * date : 2021.03.13
 *
 * */
public class MemberOfCongressManVO {
    private int mp_code;
    private String mp_name;
    private String party;

    public int getMp_code() {
        return mp_code;
    }

    public void setMp_code(int mp_code) {
        this.mp_code = mp_code;
    }

    public String getMp_name() {
        return mp_name;
    }

    public void setMp_name(String mp_name) {
        this.mp_name = mp_name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }
}