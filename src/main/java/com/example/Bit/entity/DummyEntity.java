package com.example.Bit.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class DummyEntity extends AbstractEntity {
    private String name;
    private String surname;
    private int age;
    private int number;


}
