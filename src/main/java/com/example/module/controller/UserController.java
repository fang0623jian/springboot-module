package com.example.module.controller;

import com.example.module.domain.User;
import com.example.module.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("insert")
    @ApiOperation(value="插入用户", notes="根据用户信息插入数据库")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    public void insertUser(@RequestBody User userEntity) {
        log.info("新建用户");
        userService.insertUser(userEntity);
    }
}
