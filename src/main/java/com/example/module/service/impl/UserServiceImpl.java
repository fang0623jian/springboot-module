package com.example.module.service.impl;

import com.example.module.domain.User;
import com.example.module.mapper.UserMapper;
import com.example.module.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/5/23
 * @Version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(User userEntity) {
        userMapper.insert(userEntity);
    }

    @Override
    public User queryUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
