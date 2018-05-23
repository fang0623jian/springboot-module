package com.example.module.controller;

import com.example.module.domain.User;
import com.example.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/5/23
 * @Version 1.0.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("insert")
    public void insertUser(@RequestBody User userEntity) {
        userService.insertUser(userEntity);
    }
}
