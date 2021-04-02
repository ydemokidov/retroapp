package com.group36.retroapp;

import com.group36.retroapp.configuration.db.DbConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
@EnableConfigurationProperties(DbConfiguration.class)
public class RetroappApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(RetroappApplication.class, args);
        DataSource dataSource = (DataSource) ctx.getBean("retroAppDataSource");
    }

}
