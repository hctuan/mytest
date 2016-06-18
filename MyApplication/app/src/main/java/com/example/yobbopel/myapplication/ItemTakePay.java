package com.example.yobbopel.myapplication;

/**
 * Created by YobboPEL on 18/06/2016.
 */
public class ItemTakePay {
    private int img;
    private String title;
    private String date;
    private double money;

    public ItemTakePay() {
    }

    public ItemTakePay(int img, String title, String date, double money) {
        this.img = img;
        this.title = title;
        this.date = date;
        this.money = money;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
