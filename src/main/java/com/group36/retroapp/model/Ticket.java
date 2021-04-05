package com.group36.retroapp.model;
import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tickets")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket extends BaseTextEntity {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    User author;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "assignee_id")
    User assignee;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "board_column_id")
    BoardColumn boardColumn;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "ticket")
    List<Comment> comments;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "ticket")
    List<Vote> votes;
}
