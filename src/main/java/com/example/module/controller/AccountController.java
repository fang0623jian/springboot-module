package com.example.module.controller;

import com.example.module.domain.es.Account;
import com.example.module.service.AccountService;
import com.example.module.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/6/4
 * @Version 1.0.0
 */
@RestController
@RequestMapping("account")
@Api(value = "账户相关接口",tags = "账户接口")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("save")
    @ApiOperation(value="新增账户", notes="保存用户账户信息到数据库",tags = "账户接口")
    public R saveAccount(@RequestBody @ApiParam(name = "account",value = "账户实体类") Account account) {
        accountService.save(account);
        return R.ok();
    }

    @GetMapping("query")
    @ApiOperation(value="查询账户", notes="根据用户地址查询用户账户",tags = "账户接口")
    public R queryByAddress() {
        List<Account> accounts =
                accountService.queryByAddress();
        return R.ok().put("accounts", accounts);
    }
}
