package com.example.module.service;

import com.example.module.domain.User;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/5/23
 * @Version 1.0.0
 */
public interface UserService {
    /**
     * 插入用户
     * @param userEntity
     */
    void insertUser(User userEntity);

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User queryUserById(Long id);
}
