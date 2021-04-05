package com.group36.retroapp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

@Entity
@Table(name = "team_users")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamUser extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id")
    Team team;
}
