package com.project.sinchon.vo;
/*
 *
 * title : 국회의 getter/setter
 * author : 정효인
 * date : 2021.03.13
 *
 * */
public class MemberOfCongressManVO {
    private int member_index;
    private String name;
    private String party;

    public int getMember_index() {
        return member_index;
    }

    public void setMember_index(int member_index) {
        this.member_index = member_index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }
}
