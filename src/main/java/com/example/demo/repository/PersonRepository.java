package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PersonRepository extends JpaRepository<Person, UUID> {
    Person findPersonById(UUID id);

    List<Person> findAllByAge(int age);

    @Query("select DISTINCT p from Person p where p.age = (:personAge)")
    List<Person> getPeopleByAge(int personAge);

}
