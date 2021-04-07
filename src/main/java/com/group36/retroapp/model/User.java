package com.group36.retroapp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

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

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    List<TeamUser> teamUsers;

    public User(Integer id, LocalDateTime createdAt,String lastName,String firstName,String login, String password){
        super(id,createdAt);
        this.lastName = lastName;
        this.firstName = firstName;
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                //", teamUsers=" + teamUsers +
                ", id=" + id +
                ", createdAt=" + createdAt +
                '}';
    }
}
