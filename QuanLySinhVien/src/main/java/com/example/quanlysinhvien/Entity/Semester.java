package com.example.quanlysinhvien.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

// hoc ky
@Data
@Entity
public class Semester {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int semester;
    private String year;

    @OneToMany(mappedBy = "semester")
    private List<Subject> subjects;

    @ManyToOne
    @JoinColumn(name = "statistical_id")
    private Statistical statistical;

}
