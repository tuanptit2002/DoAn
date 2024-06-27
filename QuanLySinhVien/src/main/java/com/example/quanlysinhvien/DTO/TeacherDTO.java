package com.example.quanlysinhvien.DTO;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class TeacherDTO {

    private int id;
    private String lastName;
    private String firstName;
    private Date birthDate;
    // học hàm
    private String academicRank;
    // học vị
    private String degree;
    private DepartmentDTO department;

    private List<StudentDTO> studentDTOS;
}
