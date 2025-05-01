package com.uni_educare.configaration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class CacheConfigarationTest {
    @Mock
    RedisConnectionFactory redisConnectionFactory;

    @InjectMocks
    CacheConfigaration cacheConfigaration;

    @Test
    public void setCacheConfigaration(){
        assertTrue(cacheConfigaration.redisTemplate(redisConnectionFactory) instanceof RedisTemplate<String, Object>);
    }

}
