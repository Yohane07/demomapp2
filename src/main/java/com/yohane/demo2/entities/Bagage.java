package com.yohane.demo2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Bagage {
    @Id
    private Long id;
    private String number;

    @ManyToMany(mappedBy = "bagages")
    private Set<Person> persons = new HashSet<>();
    public Bagage() {

    }
}
