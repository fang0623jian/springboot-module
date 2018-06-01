package com.example.module.domain.es;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

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
public class Author implements Serializable{
    /**
     * 作者id
     */
    private Long id;
    /**
     * 作者姓名
     */
    private String name;
    /**
     * 作者简介
     */
    private String remark;
}
