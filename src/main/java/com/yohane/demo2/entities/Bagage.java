package com.yohane.demo2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Bagage {
    @Id
    private Long id;
    private String number;

    @ManyToMany(mappedBy = "bagages")
    private List<Person> persons = new ArrayList<>();
    public Bagage() {

    }
}
