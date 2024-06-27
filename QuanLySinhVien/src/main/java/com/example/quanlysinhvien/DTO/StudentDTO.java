package com.example.quanlysinhvien.DTO;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class StudentDTO {


    private Integer id;
    private String lastName;
    private String firstName;
    private Date birthDate;
    private String homeTown;

    private ClassDTO classDTO;


    private StatisticalDTO statisticalDTO;

    private List<SubjectDTO> subjectDTOS;

    private List<PointDTO> pointDTOS;

    private List<TeacherDTO> teacherDTOS;
}
