package com.yohane.demo2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne(fetch = FetchType.LAZY)
    private Person person;
    public Bagage() {

    }
}
