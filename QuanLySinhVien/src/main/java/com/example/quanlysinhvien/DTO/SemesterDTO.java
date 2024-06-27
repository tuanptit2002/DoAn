package com.example.quanlysinhvien.DTO;


import lombok.Data;

import java.util.List;

@Data
public class SemesterDTO {

    private int id;
    private int semester;
    private String year;

    private List<SubjectDTO> subjectDTOS;

    private StatisticalDTO statisticalDTO;
}
