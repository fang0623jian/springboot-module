package com.example.module.domain.es;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
public class Tutorial {
    private Long id;
    private String name;//教程名称
}
