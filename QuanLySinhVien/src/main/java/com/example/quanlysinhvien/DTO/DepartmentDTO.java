package com.example.quanlysinhvien.DTO;

import lombok.Data;
import java.util.List;

@Data
public class DepartmentDTO {

    private int id;
    private String name;
    private List<ClassDTO> classDTOS;
    private List<TeacherDTO> teacherDTOS;
}
