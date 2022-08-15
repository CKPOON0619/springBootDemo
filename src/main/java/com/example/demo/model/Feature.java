package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="feature")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Feature {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "description")
    private String description;

    @Column(name = "attribute")
    private String attribute;

}


