/**
 * [Product]
 *     nros-base
 * [Copyright]
 *     Copyright © 2019 ZTESoft All Rights Reserved.
 * [FileName]
 *     GlobalExHandler.java
 * [History]
 *     Version  Date      Author     Content
 *     -------- --------- ---------- ------------------------
 *     1.0.0    2019年3月27日   zhouyl5    最初版本
 */
package com.example.demo.exception;

import com.example.demo.myexecption.SellException;
import com.example.demo.res.ResultVO;
import com.example.demo.res.ResultVOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理
 *
 * @Author:zhouyl5
 * @Date:2019/2/22 15:15
 * @info:Best Wishs for no BUG
 * @Modified By:
 */
@RestControllerAdvice
public class GlobalExHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExHandler.class);

    /**
     * 专门处理业务异常
     *
     * @return
     */
    /*@ExceptionHandler(BusiException.class)
    @ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
    public <T> ResponseMsg<T> handleAllException(BusiException e, HttpServletRequest request) {
        LOGGER.error(e.getMessage(), e);
        return ResponseMsg.buildFail(e.getErrorCode(), e.getMessage());
    }*/

    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public ResultVO handlerSellerException(BaseException e){
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e){
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }

}
