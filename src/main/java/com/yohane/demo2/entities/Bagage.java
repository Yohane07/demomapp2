package com.yohane.demo2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Bagage {
    @Id
    private Long id;
    private String number;

    public Bagage() {

    }
}
