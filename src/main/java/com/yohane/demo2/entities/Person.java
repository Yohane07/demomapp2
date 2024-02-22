package com.yohane.demo2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @JsonIgnore
    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = true)
    @PrimaryKeyJoinColumn
    private Passport passport;

    public Person() {

    }
}

