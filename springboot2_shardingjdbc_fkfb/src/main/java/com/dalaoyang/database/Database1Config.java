package com.dalaoyang.database;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author yangyang
 * @date 2019/1/30
 */
@Data
// @ConfigurationProperties(prefix = "database1")
@Component
public class Database1Config {
    // private String url;
    // private String username;
    // private String password;
    // private String driverClassName;
    // private String databaseName;

    public DataSource createDataSource() {
        DruidDataSource result = new DruidDataSource();
        result.setDriverClassName("com.mysql.jdbc.Driver");
        result.setUrl("jdbc:mysql://kanzhucai.rwlb.rds.aliyuncs.com:3306/kanzhucai_msg_1?useSSL=false");
        result.setUsername("kanzhucai_msg");
        result.setPassword("Chen18610081210");

        return result;
    }

    public String getDatabaseName() {
        return "database1";
    }
}
