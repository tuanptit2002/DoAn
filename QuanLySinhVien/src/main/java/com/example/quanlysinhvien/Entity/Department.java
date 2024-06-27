package com.example.quanlysinhvien.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Class> classes;

    @OneToMany(mappedBy = "department")
    private List<Teacher> teachers;
}
