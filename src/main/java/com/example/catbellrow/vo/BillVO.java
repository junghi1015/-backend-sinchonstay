package com.example.catbellrow.vo;

/*
 *
 * title : 법안머시기 getter/setter
 * author : 정효인
 * date : 2021.03.13
 *
 * */

import java.util.Date;

public class BillVO {
    private int bill_code;
    private String bill_title;
    private int bill_state;
    private Date start_date;
    private Date end_date;
    private int bill_type;
    private String bill_context;
    private int like;
    private int bill_mps;
    private String bill_party;

    public int getBill_code() {
        return bill_code;
    }

    public void setBill_code(int bill_code) {
        this.bill_code = bill_code;
    }

    public String getBill_title() {
        return bill_title;
    }

    public void setBill_title(String bill_title) {
        this.bill_title = bill_title;
    }

    public int getBill_state() {
        return bill_state;
    }

    public void setBill_state(int bill_state) {
        this.bill_state = bill_state;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getBill_type() {
        return bill_type;
    }

    public void setBill_type(int bill_type) {
        this.bill_type = bill_type;
    }

    public String getBill_context() {
        return bill_context;
    }

    public void setBill_context(String bill_context) {
        this.bill_context = bill_context;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getBill_mps() {
        return bill_mps;
    }

    public void setBill_mps(int bill_mps) {
        this.bill_mps = bill_mps;
    }

    public String getBill_party() {
        return bill_party;
    }

    public void setBill_party(String bill_party) {
        this.bill_party = bill_party;
    }
}