package com.ph.mysql.controller;

import com.ph.mysql.dao.PersonRepository;
import com.ph.mysql.model.Adress;
import com.ph.mysql.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public @ResponseBody ResponseEntity<Person> addNewPerson(@RequestBody Person person) {
        personRepository.save(person);

        return ResponseEntity.created(URI.create("/person/" + person.getId())).body(person);
//        return ResponseEntity.ok(person);
    }

    @GetMapping
    public @ResponseBody ResponseEntity<Iterable<Person>> getAllPeople() {

//        List<Person> people1 = new ArrayList<>();
//        people.forEach(people1::add);
//        List<Adress> adresses = people1.stream().findFirst().get().getAdressSet();
//        adresses.forEach(System.out::println);

        return ResponseEntity.ok(personRepository.findAll());
    }

    @GetMapping("/{id}")
    public @ResponseBody
    Person getPerson(@PathVariable Long id) {
        return personRepository.findById(id).get();
    }
}
