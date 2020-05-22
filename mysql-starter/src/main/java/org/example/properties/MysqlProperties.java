package org.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 *
 * </p>
 *
 * @author Zyred
 * @company 中在云图(重庆)科技有限公司
 * @data 2020/5/22 下午2:07
 * @since v.1
 **/
@ConfigurationProperties(prefix = "mysql")
public class MysqlProperties {

    private String url = "jdbc:mysql://localhost:3306/oytest";

    private String user = "root";

    private String password = "root";

    private String driverName = "com.mysql.jdbc.Driver";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
