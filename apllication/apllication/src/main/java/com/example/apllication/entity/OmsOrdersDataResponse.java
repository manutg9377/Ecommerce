package com.example.apllication.entity;

public class OmsOrdersDataResponse {


    private String message;
    private long Datetime;
    private String Status;

    public OmsOrdersDataResponse() {
    }

    public OmsOrdersDataResponse(String message, long datetime, String status) {
        message = message;
        Datetime = datetime;
        Status = status;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getDatetime() {
        return Datetime;
    }

    public void setDatetime(long datetime) {
        Datetime = datetime;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }


}
