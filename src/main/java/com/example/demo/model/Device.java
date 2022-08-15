package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="device")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Device {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "name")
    private String name;

    @OneToMany(targetEntity = Feature.class, cascade=CascadeType.ALL, orphanRemoval=true )
    private List<Feature> features;

}


