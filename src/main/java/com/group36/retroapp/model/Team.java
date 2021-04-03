package com.group36.retroapp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;

@Entity
@Table(name = "teams")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Team extends BaseEntity {
    @Column(name = "name",length = 100,nullable = false)
    String name;

}
