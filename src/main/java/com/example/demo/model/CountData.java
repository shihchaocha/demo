package com.example.demo.model;

public class CountData {
    public int getUserCount() {
        return userCount;
    }

    public int getUserCountActive() {
        return userCountActive;
    }

    private int userCount;
    private int userCountActive;
    public CountData(int uc, int ua) {
        userCount = uc;
        userCountActive = ua;
    }
}
