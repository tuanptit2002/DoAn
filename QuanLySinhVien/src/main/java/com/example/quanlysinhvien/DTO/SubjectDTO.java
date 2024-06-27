package com.example.quanlysinhvien.DTO;

import lombok.Data;

import java.util.List;

@Data
public class SubjectDTO {

    private int id;
    private String codeSubject;
    private String title;
    private String name;
    private int credits;
    private int periods;

    private SemesterDTO semesterDTO;

    private List<StudentDTO> studentDTOS;


    private PointDTO pointDTO;

    private List<TeacherDTO> teacherDTOS;
}
