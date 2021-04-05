package com.group36.retroapp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "board_columns")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardColumn extends BaseNamedEntity {

    @Column(name = "order")
    int order;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "board_id")
    Board board;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "boardColumn")
    List<Ticket> tickets;
}