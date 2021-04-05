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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    User author;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ticket_id")
    Ticket ticket;
}
