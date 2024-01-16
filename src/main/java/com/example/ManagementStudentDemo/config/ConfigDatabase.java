package com.example.ManagementStudentDemo.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDatabase {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl ="jdbc:sqlserver://localhost:1433;" + "databaseName=QLStudents;integratedSecurity=true;" + "encrypt=true;trustServerCertificate=true";
        dataSourceBuilder.url(connectionUrl);
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("123456789");
        return dataSourceBuilder.build();
    }
    
}
