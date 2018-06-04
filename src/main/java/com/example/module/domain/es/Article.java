package com.example.module.domain.es;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.util.Date;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/6/1
 * @Version 1.0.0
 */
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "xmp", type = "article")
public class Article {
    @Id
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 摘要
     */
    private String abstracts;
    /**
     * 内容
     */
    private String content;
    /**
     * 发表时间
     */
    private Date postTime;
    /**
     * 点击率
     */
    private Long clickCount;
    /**
     * 作者
     */
    private Author author;
    /**
     * 所属教程
     */
    private Tutorial tutorial;
}
