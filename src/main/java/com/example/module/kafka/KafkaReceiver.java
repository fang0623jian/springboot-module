package com.example.module.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.Optional;

/**
 * @Description:kafka消息接受
 * @Author：fang_jian
 * @Date:Create in 2018/5/29
 * @Version 1.0.0
 */
//@Component
@Slf4j
public class KafkaReceiver {

    @KafkaListener(topicPattern = "zhisheng")
    public void listen(ConsumerRecord<?, ?> record) {

        Optional<?> kafkaMessage = Optional.ofNullable(record.value());

        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();

            log.info("----------------- record =" + record);
            log.info("------------------ message =" + message);
        }

    }
}
