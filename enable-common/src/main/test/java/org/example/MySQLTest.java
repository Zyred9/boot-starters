package org.example;

import lombok.SneakyThrows;
import org.example.app.CommonAutoConfigureApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * <p>
 *
 * </p>
 *
 * @author Zyred
 * @company 中在云图(重庆)科技有限公司
 * @data 2020/5/22 下午3:17
 * @since v.1
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommonAutoConfigureApplication.class)
public class MySQLTest {

    @Resource(name = "mysqlConnection")
    private Connection connection;



    @Test
    @SneakyThrows
    public void testMyStarter(){
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from tb_user");
        while (rs.next()) {
            // 通过字段检索
            String id = rs.getString("id");
            String name = rs.getString("mobile");
            String password = rs.getString("email");

            System.out.print(" id:" + id);
            System.out.print(" 电话:" + name);
            System.out.print(" 邮箱:" + password + "\n");
        }
        rs.close();
        statement.close();
        connection.close();
//        id:1259027228398850048 电话:18325011212 邮箱:18325011211@163.com
//        id:1259067349122813952 电话:18325011211 邮箱:18325011211@163.com
    }

}
