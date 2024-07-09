package com.yrainy.order.service.impl;

import com.yrainy.order.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 用户服务
 *
 * @author zhanglun
 * @since 2024-07-09
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    private static final String USER_SERVICE_ID = "user";

    @Override
    public String getUserInfo(String userId) {
        ServiceInstance instance = loadBalancerClient.choose(USER_SERVICE_ID);
        String url = "http://".concat(instance.getHost()).concat(":")
                .concat(String.valueOf(instance.getPort()))
                .concat("/getUserInfo?userId=").concat(userId);
        return restTemplate.getForObject(url, String.class);
    }
}
