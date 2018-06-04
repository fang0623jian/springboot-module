package com.example.module.repository;

import com.example.module.domain.es.Account;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/6/4
 * @Version 1.0.0
 */
public interface AccountRespository extends ElasticsearchRepository<Account, Long> {
}
