package com.spring.core.assigment.javaconfig;

import com.spring.core.assigment.DataSource;
import com.spring.core.assigment.MySQLDataSource;
import com.spring.core.assigment.PostgreSQLDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.assigment")
public class AppConfig {
    @Bean
    public DataSource mysqlDataSource() {
        return new MySQLDataSource();
    }

    @Bean
    public DataSource postgreSQLDataSource() {
        return new PostgreSQLDataSource();
    }



}
