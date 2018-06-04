package com.example.module.controller;

import com.example.module.domain.User;
import com.example.module.service.UserService;
import com.example.module.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/5/23
 * @Version 1.0.0
 */
@RestController
@RequestMapping("user")
@Slf4j
@Api(value = "用户conreoller",tags = "{用户接口操作}")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("insert")
    @ApiOperation(value="插入用户", notes="根据用户信息插入数据库",tags = "插入用户接口")
    public R insertUser(@RequestBody @ApiParam(name = "userEntity",value = "用户实体类") User userEntity) {
        userService.insertUser(userEntity);
        return R.ok();
    }

    @GetMapping("query/{id}")
    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "Long",paramType = "Long")
    public R queryUserById(@PathVariable @ApiParam(name = "id",value = "用户id") Long id) {
        User user = userService.queryUserById(id);
        return R.ok().put("user", user);
    }
}
