package com.example.quanlysinhvien.DTO;

import lombok.Data;

import java.util.List;

@Data
public class ClassDTO {

    private Integer id;
    private String name;
    private DepartmentDTO departmentDTO;
    private List<StudentDTO> studentsDTOs;
}
