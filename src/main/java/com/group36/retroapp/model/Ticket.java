package com.group36.retroapp.model;
import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;


@Entity
@Table(name = "tickets")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private User authorId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignee_id")
    private User assigneeId;

    @Column(name="text",length = 500,nullable = false)
    String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_column_id")
    private BoardColumn boardColumnId;
}
