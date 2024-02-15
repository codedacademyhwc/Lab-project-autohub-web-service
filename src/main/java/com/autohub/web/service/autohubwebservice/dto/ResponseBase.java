package com.autohub.web.service.autohubwebservice.dto;

import lombok.Data;

@Data
public class ResponseBase<T> {
    
    private T data;
    private String errorCode;
    private String errorMessage;

    public Boolean isError(){
        return !errorCode.equals("0000");
    }
}
