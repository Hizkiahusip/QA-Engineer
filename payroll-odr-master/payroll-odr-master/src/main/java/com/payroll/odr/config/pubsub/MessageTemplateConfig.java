package com.payroll.odr.config.pubsub;

import org.redisson.spring.data.connection.RedissonConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

/**
 * RedisConfig
 */
@Configuration
public class MessageTemplateConfig {

    @Autowired
    private RedissonConnectionFactory redissonConnectionFactory;
    
    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redissonConnectionFactory);
        template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
        return template;
    }
}