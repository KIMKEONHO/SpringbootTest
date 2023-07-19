package com.example.test3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Comunity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String writer;

    @Column
    private String content;

}
