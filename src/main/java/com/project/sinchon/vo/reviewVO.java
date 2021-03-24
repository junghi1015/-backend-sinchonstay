package com.project.sinchon.vo;

/**
 * title : 리뷰 getter/setter
 * author : 정효인
 * date : 2021.03.24
 *
 * */

public class reviewVO {
    private int review_ID;
    private String user_ID;
    private int res_ID;
    private String contents;

    public int getReview_ID() {
        return review_ID;
    }

    public void setReview_ID(int review_ID) {
        this.review_ID = review_ID;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public int getRes_ID() {
        return res_ID;
    }

    public void setRes_ID(int res_ID) {
        this.res_ID = res_ID;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public date getReg_date() {
        return reg_date;
    }

    public void setReg_date(date reg_date) {
        this.reg_date = reg_date;
    }

    public int getRegroup_ID() {
        return regroup_ID;
    }

    public void setRegroup_ID(int regroup_ID) {
        this.regroup_ID = regroup_ID;
    }

    public int getReparents_ID() {
        return reparents_ID;
    }

    public void setReparents_ID(int reparents_ID) {
        this.reparents_ID = reparents_ID;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    private int grade;
    private date reg_date;
    private int regroup_ID;
    private int reparents_ID;
    private int depth;

}
