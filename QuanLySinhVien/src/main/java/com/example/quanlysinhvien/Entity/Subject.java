package com.example.quanlysinhvien.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codeSubject;
    private String title;
    private String name;
    private int credits;
    private int periods;

    @ManyToOne
    @JoinColumn(name = "semester_id")
    private Semester semester;

    @ManyToMany
    @JoinTable(name = "student_subject",
    joinColumns = @JoinColumn(name = "subject_id"),
    inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

    @OneToOne(mappedBy = "subject")
    private Point point;

    @ManyToMany
    @JoinTable(name = "subject_teacher",
    joinColumns = @JoinColumn(name = "subject_id"),
    inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teacher> teachers;
}
