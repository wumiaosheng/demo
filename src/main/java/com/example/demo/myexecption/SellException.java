package com.example.demo.myexecption;

import com.example.demo.enums.ResultEnum;
import com.example.demo.exception.BaseException;
import lombok.Getter;

@Getter
public class SellException extends BaseException {

    public Integer code;
    private String message;
    private String date;


    public SellException(ResultEnum resultEnum) {
       /// super(resultEnum.getCode(),resultEnum.getMessage());
        this.message=resultEnum.getMessage();
        this.code = resultEnum.getCode();
    }


}
