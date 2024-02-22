package com.yohane.demo2.controllers;

import com.yohane.demo2.entities.Person;
import com.yohane.demo2.repositories.PersonRepository;
import com.yohane.demo2.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/persons")
public class PersonControllers {
    private final PersonService personService;
    private final PersonRepository personRepository;


    @Autowired
    public PersonControllers(PersonService personService, PersonRepository personRepository) {
        this.personService = personService;
        this.personRepository = personRepository;
    }

    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return personService.getPersonById(id);
    }

    @GetMapping("/{name}")
    public Optional<Person> getPerson(@PathVariable String name){
        return personService.getPersonName(name);
    }

    @GetMapping("/name")
    public String getPersonByname(){
        Person person = personRepository.getReferenceById(1L);
        return person.getName();
    }



    @GetMapping()
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }

  /*  @PostMapping("/save")
    public ResponseEntity<Person> savePersonnne(@RequestBody Person person) {
        Person savedPerson = personneService.savePersonne(person);
        return new ResponseEntity<>(savedPerson,
                httpStatus.CREATED);
    }
*/
}
