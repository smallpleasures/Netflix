package com.yrainy.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 *
 * @author zhanglun
 * @since 2024-07-09
 */
@RestController
@Slf4j
public class UserController {

    @GetMapping("/getUserInfo")
    public String getUserInfo(String userId) {
        log.info("用户信息:{}", userId);
        return userId;
    }
}
