package com.group36.retroapp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teams")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Team extends BaseNamedEntity {
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "team")
    List<Board> boards;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "team")
    List<TeamUser> teamUsers;
}
