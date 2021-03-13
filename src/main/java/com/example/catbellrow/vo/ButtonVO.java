package com.example.catbellrow.vo;

/*
 *
 * title : 서브메뉴 getter/setter
 * author : 정효인
 * date : 2021.03.13
 *
 * */

public class ButtonVO {
    private String button_name;
    private int bill_type;

    public String getButton_name() {
        return button_name;
    }

    public void setButton_name(String button_name) {
        this.button_name = button_name;
    }

    public int getBill_type() {
        return bill_type;
    }

    public void setBill_type(int bill_type) {
        this.bill_type = bill_type;
    }

    public int getClick_check() {
        return click_check;
    }

    public void setClick_check(int click_check) {
        this.click_check = click_check;
    }

    private int click_check;
}
