package com.project.sinchon.vo;
/**
 * title : 방 getter/setter
 * author : 정효인
 * date : 2021.03.24
 * update log 
 * 		2021.04.10 : 여인준 / DB재설계에 따른 capacity 속성 및 getter setter 추가  
 **/
public class roomVO {
    private int room_ID;
    private String room_type;
    private String room_img;
    private String bed;
    private String bathroom;
    private	int capacity;
    private int price_day;
    private int price_month;

    public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getRoom_ID() {
        return room_ID;
    }

    public void setRoom_ID(int room_ID) {
        this.room_ID = room_ID;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getRoom_img() {
        return room_img;
    }

    public void setRoom_img(String room_img) {
        this.room_img = room_img;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public int getPrice_day() {
        return price_day;
    }

    public void setPrice_day(int price_day) {
        this.price_day = price_day;
    }

    public int getPrice_month() {
        return price_month;
    }

    public void setPrice_month(int price_month) {
        this.price_month = price_month;
    }
}
