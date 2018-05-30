package com.example.module;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/5/30
 * @Version 1.0.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void testStringOperate() throws Exception {
        //set.get命令
        ValueOperations<String, String> strOperations = redisTemplate.opsForValue();
        strOperations.set("holoera:user:name", "fangjian");
        strOperations.set("holoera:user:age", "24");
        strOperations.set("holoera:user:sex", "1");

        String name = strOperations.get("holoera:user:name");
        String age = strOperations.get("holoera:user:age");
        String sex = strOperations.get("holoera:user:sex");

        System.out.println("用户姓名：" + name + ";年龄：" + age + ";性别：" + sex);
        System.out.println("==============================================================");

        strOperations.set("holoera:product:price", "100", 10000L, TimeUnit.MILLISECONDS);
        strOperations.set("holoera:product:num", "10", 50000L, TimeUnit.MILLISECONDS);

        Thread.sleep(5000L);

        String price = strOperations.get("holoera:product:price");
        String num = strOperations.get("holoera:product:num");

        System.out.println("商品价格:" + price + ";数量：" + num);

    }
}
