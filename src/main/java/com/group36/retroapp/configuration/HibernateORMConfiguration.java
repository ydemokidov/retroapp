package com.group36.retroapp.configuration;

import com.group36.retroapp.configuration.db.DbConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.group36.retroapp.configuration.db")
public class HibernateORMConfiguration {
    @Bean
    @Autowired
    DataSource retroAppDataSource(DbConfiguration dbConfiguration){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(dbConfiguration.getDriver());
        dataSourceBuilder.url(dbConfiguration.getUrl());
        dataSourceBuilder.username(dbConfiguration.getLogin());
        dataSourceBuilder.password(dbConfiguration.getPassword());
        return dataSourceBuilder.build();
    }
}
