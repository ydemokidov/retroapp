package com.group36.retroapp.configuration.db;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "retroapp.db")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class DbConfiguration {
    String login;
    String password;
    String url;
    String driver;
}
