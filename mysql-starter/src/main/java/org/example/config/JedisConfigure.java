package org.example.config;

import org.example.properties.JedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

/**
 * <p>
 *
 * </p>
 *
 * @author Zyred
 * @company 中在云图(重庆)科技有限公司
 * @data 2020/5/22 下午5:25
 * @since v.1
 **/
@Configuration
@EnableConfigurationProperties(JedisProperties.class)
public class JedisConfigure {

    /**
     * 测试一个项目能都完成多个多个starter的注入
     * @param properties
     * @return
     */
    @Bean(name = "myJedisClient")
    public Jedis getJedis(JedisProperties properties){
        return new Jedis(properties.getUrl(), properties.getPort());
    }

}
