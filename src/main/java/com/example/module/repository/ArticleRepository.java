package com.example.module.repository;

import com.example.module.domain.es.Article;
import com.example.module.domain.es.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/6/1
 * @Version 1.0.0
 */
public interface ArticleRepository extends ElasticsearchRepository<Article, Long> {

    Page<Article> findByAuthor(Author author, Pageable pageable);

    List<Article> findByTitle(String title);

    Page<Article> findByTitle(String title, Pageable pageable);
}
