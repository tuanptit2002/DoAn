package com.example.quanlysinhvien.DTO;

import lombok.Data;

import java.util.List;

@Data
public class PointDTO {

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

    private List<StudentDTO> studentDTOS;


    private List<TeacherDTO> teacherDTOS;

    private SubjectDTO subjectDTO;
}
