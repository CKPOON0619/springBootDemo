package com.example.demo.service.person;

import com.example.demo.model.Person;
import com.example.demo.repository.DeviceRepository;
import com.example.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{

    private final PersonRepository personRepository;
    private final DeviceRepository deviceRepository;
    @Override
    public Person getPerson(UUID id) {
        return personRepository.findPersonById(id);
    }

    public Person addDevice(UUID personId, List<UUID> deviceIds) {
        var person= personRepository.getReferenceById(personId);
        var devices= deviceRepository.findByIdIn(deviceIds);
        person.setDevices(devices);  ;
        return personRepository.save(person);
    }

}
