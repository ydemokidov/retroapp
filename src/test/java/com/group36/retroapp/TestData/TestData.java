package com.group36.retroapp.TestData;

import com.group36.retroapp.model.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
public class TestData {
    final List<User> userList;
    final User newUser;
    final TestMatcher<User> userMatcher = TestMatcher.usingFieldsWithIgnoringAssertions(User.class, "createdAt", "teamUsers","id");

    public TestData() {
        userList = new ArrayList<>();
        userList.add(new User(1, LocalDateTime.now(),"Ivanov","Ivan","ivan_01","123"));
        userList.add(new User(2,LocalDateTime.now(),"Petrov","Petr","petr_01","123"));
        userList.add(new User(3,LocalDateTime.now(),"Sergeev","Sergey","serg_01","123"));

        newUser = new User(null,LocalDateTime.now(),"Ivanov3","Ivan","svanov","123");
    }

}
