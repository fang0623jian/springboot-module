package com.example.module.service;

import com.example.module.domain.es.Account;

import java.util.List;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/6/4
 * @Version 1.0.0
 */
public interface AccountService {
    /**
     * 保存账号
     */
    void save(Account account);

    /**
     * 根据地址值过滤
     * @return
     */
    List<Account> queryByAddress();
}
