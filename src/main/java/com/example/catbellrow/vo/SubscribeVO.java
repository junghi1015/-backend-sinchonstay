package com.example.catbellrow.vo;

/*
 *
 * title : 구독 getter/setter
 * author : 정효인
 * date : 2021.03.13
 *
 * */

public class SubscribeVO {
    private int bill_code;

    public int getBill_code() {
        return bill_code;
    }

    public void setBill_code(int bill_code) {
        this.bill_code = bill_code;
    }

    public int getSub_check() {
        return sub_check;
    }

    public void setSub_check(int sub_check) {
        this.sub_check = sub_check;
    }

    private int sub_check;
}
