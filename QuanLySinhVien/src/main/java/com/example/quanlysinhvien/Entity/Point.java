package com.example.quanlysinhvien.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.EnableMBeanExport;

import java.util.List;

@Data
@Entity
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // chuyen can
    private double diligence;
    // giua ky
    private double midTest;
    // diem thuc hanh
    private double practice;

    private double homeWork;

    private double lastTestOne;
    private double lasTestTwo;
    private double finalGrade;

    @ManyToMany
    @JoinTable(name = "student_point",
    joinColumns = @JoinColumn(name = "point_id"),
    inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> students;

    @ManyToMany
    @JoinTable(name = "subject_teacher",
    joinColumns = @JoinColumn(name = "point_id"),
    inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private List<Teacher> teachers;

    @OneToOne
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;

    @ManyToMany
    @JoinTable(name = "student_subject",
    joinColumns = @JoinColumn(name = "point_id"),
    inverseJoinColumns = @JoinColumn(name = "student_id"))
    private List<Student> studentSubjects;
}
