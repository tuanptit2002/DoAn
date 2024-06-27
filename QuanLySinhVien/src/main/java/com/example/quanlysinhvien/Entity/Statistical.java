package com.example.quanlysinhvien.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Statistical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double pointAvg;
    private double pointTraining;

    @OneToMany(mappedBy = "statistical")
    private List<Semester> semesters;

    @OneToMany(mappedBy = "statistical")
    private List<Student> students;
}
