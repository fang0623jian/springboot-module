package com.example.module.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Description:kafka消息实体类
 * @Author：fang_jian
 * @Date:Create in 2018/5/25
 * @Version 1.0.0
 */
@Data
public class Message {
    private Long id;
    private String msg;
    private Date sendTime;
}
