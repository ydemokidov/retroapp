package com.group36.retroapp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "boards")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Board extends BaseNamedEntity {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id")
    Team team;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "board")
    List<BoardColumn> columns;
}