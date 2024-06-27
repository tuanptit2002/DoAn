package com.example.quanlysinhvien.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lastName;
    private String firstName;
    private Date birthDate;
    private String homeTown;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class aClass;

    @ManyToOne
    @JoinColumn(name = "statistical_id")
    private Statistical statistical;

    @ManyToMany(mappedBy = "students")
    private List<Subject> subjects;

    @ManyToMany(mappedBy = "students")
    private List<Point> points;

    @ManyToMany
    @JoinTable(name = "student_teacher", joinColumns = @JoinColumn(name = " student_id"),
    inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teacher> teachers;
}
