package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException {

    public Integer code;
    private String message;

    public BaseException(Integer code,String message) {
        this.code = code;
        this.message = message;
    }

    public BaseException() {
        super();
    }

}
