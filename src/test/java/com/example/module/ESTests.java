package com.example.module;

import com.example.module.domain.es.Article;
import com.example.module.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/6/1
 * @Version 1.0.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ESTests {
    @Autowired
    private ElasticsearchOperations es;

    @Autowired
    private ArticleService articleService;

    @Test
    public void testFindAll() {
        Iterable<Article> articles = articleService.findAll();
        for (Article arcitle : articles) {
            System.out.println(arcitle.toString());
        }
    }
}
