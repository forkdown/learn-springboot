package com.dalaoyang.database;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @author yangyang
 * @date 2019/1/30
 */
@Data
// @ConfigurationProperties(prefix = "database0")
@Component
public class Database0Config {
    // private String url;
    // private String username;
    // private String password;
    // private String driverClassName;
    // private String databaseName;

    public DataSource createDataSource() {
        DruidDataSource result = new DruidDataSource();
        result.setDriverClassName("com.mysql.jdbc.Driver");
        result.setUrl("jdbc:mysql://kanzhucai.rwlb.rds.aliyuncs.com:3306/kanzhucai_msg?useSSL=false");
        result.setUsername("kanzhucai_msg");
        result.setPassword("Chen18610081210");
        return result;
    }

    public String getDatabaseName() {
        return "database0";
    }
}
