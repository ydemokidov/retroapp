package com.group36.retroapp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseEntity {
    @Column(name = "last_name",length = 100,nullable = false)
    String lastName;

    @Column(name = "fst_name",length = 100,nullable = false)
    String firstName;

    @Column(length = 50,nullable = false)
    String login;

    @Column(name="pwd",length = 50,nullable = false)
    String password;

    public User(Integer id, LocalDateTime createdAt,String lastName,String firstName,String login, String password){
        super(id,createdAt);
        this.lastName = lastName;
        this.firstName = firstName;
        this.login = login;
        this.password = password;
    }
}
