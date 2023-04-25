package com.example.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
class A {
    @Id
    private Long id;
    private List<B> lisfOfB = new ArrayList<>();
}
