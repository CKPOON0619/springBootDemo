package com.example.demo.controller;

import com.example.demo.model.Device;
import com.example.demo.model.Feature;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.person.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository repository;
    private final PersonService personService;

    @GetMapping(path="/{personId}")
    public Person getPerson(@PathVariable("personId") UUID id) {
        return personService.getPerson(id);
    }

    @PostMapping(path="/{personId}/addDevice")
    public Person addDevice(@PathVariable("personId") UUID personId, @RequestBody List<UUID> deviceIds) {
        return personService.addDevice(personId, deviceIds);
    }
}
