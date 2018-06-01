package com.example.module.service;

import com.example.module.domain.es.Article;
import com.example.module.domain.es.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/6/1
 * @Version 1.0.0
 */
public interface ArticleService {

    Article save(Article article);

    void delete(Article article);

    Article findOne(Long id);

    Iterable<Article> findAll();

    Page<Article> findByAuthor(Author author, PageRequest pageRequest);

    Page<Article> findByTitle(String title, PageRequest pageRequest);

    List<Article> findByTitle(String title);

    Iterable<Article> search(String queryString);

}
