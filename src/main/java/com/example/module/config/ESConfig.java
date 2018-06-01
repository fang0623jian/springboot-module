package com.example.module.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * @Description:ES配置
 * @Author：fang_jian
 * @Date:Create in 2018/6/1
 * @Version 1.0.0
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.module.repository")
public class ESConfig {

}
