package com.fh.controller;


import com.fh.utils.ResponseServer;
import com.fh.utils.ServerEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/logins")
@CrossOrigin(maxAge = 3600, origins = "http://localhost:8080")
public class LoginController {

  /*  @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping
    public ResponseServer sendCode(String phone) throws IOException {
        //先判断一下
        if (StringUtils.isBlank(phone)) {
            return ResponseServer.error(ServerEnum.PHONE_ISNULL);
        }
        //查询手机号是否注册

        //先发送验证码
        JSONObject jsonObject = SendMessage.sendMessage(phone);
        String code = jsonObject.getString("code");
        if (code.equals("200")) {
            String checkCode = jsonObject.getString("obj");
            redisTemplate.opsForValue().set("code_" + phone, checkCode, 300, TimeUnit.SECONDS);
        }
        //如果没注册先注册
        return ResponseServer.success();
    }*/
}
