package com.group36.retroapp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

@Entity
@Table(name = "votes")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vote extends BaseEntity {
    @Column(name = "type",length = 100,nullable = false)
    String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private User authorId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id")
    private Ticket ticketId;
}
