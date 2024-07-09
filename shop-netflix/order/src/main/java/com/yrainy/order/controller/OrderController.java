package com.yrainy.order.controller;

import com.yrainy.order.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单控制器
 *
 * @author zhanglun
 * @since 2024-07-09
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private IUserService userService;

    @PostMapping("/createOrder")
    public String createOrder(String userId) {
        String userInfo = userService.getUserInfo(userId);
        return "创建订单成功,用户信息:".concat(userInfo);
    }
}
