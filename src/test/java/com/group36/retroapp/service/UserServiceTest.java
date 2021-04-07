package com.group36.retroapp.service;

import com.group36.retroapp.TestData.TestData;
import com.group36.retroapp.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
@Sql(scripts = "classpath:sql/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
class UserServiceTest {
    TestData testData = new TestData();

    @Autowired
    UserService userService;

    @Test
    void getAll() {
        List<User> expected = testData.getUserList().stream().sorted((o1, o2) -> {
            if(o1.getId()<o2.getId()){
                return -1;
            }else
            {
                return 1;
            }
        }).collect(Collectors.toList());
        List<User> actual = userService.getAll(0,5,"id");
        testData.getUserMatcher().assertMatch(actual,expected);
    }

    @Test
    void getById() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void getByLogin() {
    }

    @Test
    void getAllSortByLogin() {
    }
}