package com.example.demo.service.person;

import com.example.demo.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonService {
    Person getPerson(UUID id);
    Person addDevice(UUID personId, List<UUID> deviceIds);
}
