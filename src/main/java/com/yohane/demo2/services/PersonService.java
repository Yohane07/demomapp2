package com.yohane.demo2.services;

import com.yohane.demo2.entities.Person;
import com.yohane.demo2.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // Méthode pour récupérer toutes les personnes
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    // Méthode pour récupérer une personne par son ID
    public Optional<Person> getPersonById(Long id) {
        return personRepository.findById(id);
    }

    public Optional<Person> getPersonName(String name){
        return personRepository.findByName(name);
    }

    // Méthode pour sauvegarder une personne
    public Person savePersonne(Person person) {
        return personRepository.save(person);
    }

    // Méthode pour supprimer une personne par son ID
    public void deletePersonById(Long id) {
        personRepository.deleteById(id);
    }
}
