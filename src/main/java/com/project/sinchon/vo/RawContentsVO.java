package com.project.sinchon.vo;


/*
 *
 * title : 법안 리스 getter/setter
 * author : 정효인
 * date : 2021.03.14
 *
 * */
public class RawContentsVO {

    private int raw_season;
    private int raw_num;
    private String charge;
    private String raw_kind;
    private String raw_group;
    private String status;
    private String keyword;
    private String raw_title;
    private String regist_data;
    private String join_member;

    public int getRaw_season() {
        return raw_season;
    }

    public void setRaw_season(int raw_season) {
        this.raw_season = raw_season;
    }

    public int getRaw_num() {
        return raw_num;
    }

    public void setRaw_num(int raw_num) {
        this.raw_num = raw_num;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getRaw_kind() {
        return raw_kind;
    }

    public void setRaw_kind(String raw_kind) {
        this.raw_kind = raw_kind;
    }

    public String getRaw_group() {
        return raw_group;
    }

    public void setRaw_group(String raw_group) {
        this.raw_group = raw_group;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getRaw_title() {
        return raw_title;
    }

    public void setRaw_title(String raw_title) {
        this.raw_title = raw_title;
    }

    public String getRegist_data() {  return regist_data; }

    public void setRegist_data(String regist_data) { this.regist_data = regist_data; }

    public String getJoin_member() { return join_member; }

    public void setJoin_member(String join_member) { this.join_member = join_member; }
}
