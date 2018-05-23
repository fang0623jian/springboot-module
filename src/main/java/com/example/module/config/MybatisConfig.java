package com.example.module.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/5/23
 * @Version 1.0.0
 */
@Configuration
@MapperScan("com.example.module.mapper")
public class MybatisConfig {
}
