package com.example.codeclan.file_person_folder_hw.controllers;

import com.example.codeclan.file_person_folder_hw.models.File;
import com.example.codeclan.file_person_folder_hw.models.Person;
import com.example.codeclan.file_person_folder_hw.repositories.FileRepository;
import com.example.codeclan.file_person_folder_hw.repositories.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRespository personRepository;


    @GetMapping(value = "/persons")
    public ResponseEntity<List<Person>> getAllPersons(){

        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/persons/{id}")
    public ResponseEntity getPerson(@PathVariable Long id){

        return new ResponseEntity(personRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/persons")
    public ResponseEntity<Person> postPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }
}
