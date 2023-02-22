package com.example.bsppro.utils;

import java.io.Serializable;

public class Response<T> implements Serializable {
    public String message;
    public T data;
    public int code;
    public static <T> Response<T> ok(T data){
        Response<T> response = new Response<>();
        response.message="Success";
        response.code=200;
        response.data=data;
        return response;
    }
}
