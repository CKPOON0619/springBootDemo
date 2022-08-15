package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="person")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    @OneToMany(targetEntity = Device.class, cascade = CascadeType.ALL, orphanRemoval=true)
    private List<Device> devices;


}
