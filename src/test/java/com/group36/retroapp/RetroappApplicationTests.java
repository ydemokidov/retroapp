package com.group36.retroapp;

import com.group36.retroapp.model.Comment;
import com.group36.retroapp.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RetroappApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {

    }

    @Test
    public void createUser(){
        //создание новых сущностей
/*
        User u = new User(null,LocalDateTime.now(),"Ivanov","Ivan","ivanov","123");
        User u1 = new User(null,LocalDateTime.now(),"Ivanov1","Ivan","kvanov","123");
        User u2 = new User(null,LocalDateTime.now(),"Ivanov2","Ivan","dvanov","123");
        User u3 = new User(null,LocalDateTime.now(),"Ivanov3","Ivan","svanov","123");
        User u4 = new User(null,LocalDateTime.now(),"Ivanov4","Ivan","bvanov","123");
        userService.save(u);
        userService.save(u1);
        userService.save(u2);
        userService.save(u3);
        userService.save(u4); */

        //проверка получения списка, отсортированного по логину
        //List<User> users = (List<User>) userService.getAllSortByLogin();

        /*u2.setLastName("Petrov");
        userService.save(u2);*/
    }
}
