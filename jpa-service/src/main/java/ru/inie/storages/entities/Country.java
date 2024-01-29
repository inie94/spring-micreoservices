package ru.inie.storages.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COUNTRIES")
public class Country {
    @Id
    @GeneratedValue
    Long id;

    String name;
}
