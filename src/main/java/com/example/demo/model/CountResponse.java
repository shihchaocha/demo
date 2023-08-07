package com.example.demo.model;

public class CountResponse {
    public String getStatus() {
        return status;
    }

    private String status;

    public int getCode() {
        return code;
    }

    public CountData getData() {
        return data;
    }

    private int code;
    private CountData data;



    public CountResponse(String status, int code, int count, int active) {
        this.status = status;
        this.code = code;
        data = new CountData(count, active);
    }
}
