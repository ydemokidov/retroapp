package com.group36.retroapp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "last_name",length = 100,nullable = false)
    String lastName;

    @Column(name = "fst_name",length = 100,nullable = false)
    String firstName;

    @Column(length = 50,nullable = false)
    String login;

    @Column(name="pwd",length = 50,nullable = false)
    String password;

    @Column(name="created_at",nullable = false)
    LocalDateTime createdAt;
}
