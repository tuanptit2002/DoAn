package com.example.quanlysinhvien.DTO;

import lombok.Data;

import java.util.List;

@Data
public class StatisticalDTO {

    private Integer id;
    private double pointAvg;
    private double pointTraining;

    private List<SemesterDTO> semesters;

    private List<StudentDTO> students;
}
