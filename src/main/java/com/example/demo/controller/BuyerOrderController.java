package com.example.demo.controller;

import com.example.demo.enums.ResultEnum;
import com.example.demo.myexecption.SellException;
import com.example.demo.res.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {


    //创建订单
    @RequestMapping("/create")
    public ResultVO<Map<String,String>> create(){
        log.error("[创建订单] 购物不能为空");
        throw new SellException(ResultEnum.CART_EMPTY);
    }

}
