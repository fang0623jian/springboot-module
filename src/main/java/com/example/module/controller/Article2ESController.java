package com.example.module.controller;

import com.example.module.domain.es.Article;
import com.example.module.service.ArticleService;
import com.example.module.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/6/4
 * @Version 1.0.0
 */
@RestController
@RequestMapping("article")
@Slf4j
public class Article2ESController {

    @Autowired
    private ArticleService articleService;


    @PostMapping("save")
    public R saveArticle(@RequestBody Article article) {
        articleService.save(article);
        return R.ok();
    }

    public R queryArticle() {
        return R.ok();
    }
}
