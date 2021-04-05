package com.group36.retroapp.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PROTECTED)
@MappedSuperclass
public class BaseTextEntity extends BaseEntity {
    @Column(name="text",length = 1000,nullable = false)
    String text;
}
