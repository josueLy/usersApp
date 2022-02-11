package com.example.usersApp.helper;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date timestamp = new Date();
    private Object status;
    private String message;
    private Object data;
    private Object dataToken;
    private Object paramsPage;

    public Response() {
        timestamp = new Date();
    }

    public Response(String message, Object status, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Response(String message, Object status, Object data, Object dataToken) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.dataToken = dataToken;
    }


    public Response(String message, Object status) {
        this.status = status;
        this.message = message;
    }

    public Object getDataToken() {
        return dataToken;
    }

    public void setDataToken(Object dataToken) {
        this.dataToken = dataToken;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
