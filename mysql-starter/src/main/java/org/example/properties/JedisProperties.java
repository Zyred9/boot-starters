package org.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 *
 * </p>
 *
 * @author Zyred
 * @company 中在云图(重庆)科技有限公司
 * @data 2020/5/22 下午5:23
 * @since v.1
 **/

@ConfigurationProperties(prefix = "jedis")
public class JedisProperties {

    private String url = "localhost";
    private int port = 6379;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
