package com.example.module.service.impl;

import com.example.module.domain.es.Account;
import com.example.module.repository.AccountRespository;
import com.example.module.service.AccountService;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/6/4
 * @Version 1.0.0
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRespository accountRespository;

    @Override
    public void save(Account account) {
        accountRespository.save(account);
    }

    @Override
    public List<Account> queryByAddress() {
        // 根据地址值过滤
        Pageable page = new PageRequest(0,10);
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
        queryBuilder.must(QueryBuilders.matchQuery("address","北京"));
        SearchQuery query =
                new NativeSearchQueryBuilder().withQuery(queryBuilder).withPageable(page).build();
        Page<Account> pages = accountRespository.search(query);
        return pages.getContent();
    }
}
