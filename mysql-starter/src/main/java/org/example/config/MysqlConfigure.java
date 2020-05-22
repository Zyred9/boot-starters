package org.example.config;

import org.example.properties.MysqlProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * <p>
 *
 * </p>
 *
 * @author Zyred
 * @company 中在云图(重庆)科技有限公司
 * @data 2020/5/22 下午2:04
 * @since v.1
 **/
@Configuration
@EnableConfigurationProperties(MysqlProperties.class)
public class MysqlConfigure {

    @Bean(name = "mysqlConnection")
    @lombok.SneakyThrows
    public Connection getConnection(MysqlProperties properties){
        Class.forName(properties.getDriverName());
        return DriverManager.getConnection(properties.getUrl(),
                properties.getUser(), properties.getPassword());
    }

}
