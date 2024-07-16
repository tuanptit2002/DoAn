package com.example.quanlysinhvien.Mapper;

import com.example.quanlysinhvien.DTO.TeacherDTO;
import com.example.quanlysinhvien.Entity.Department;
import com.example.quanlysinhvien.Entity.Teacher;

public class TeacherMapper {

    public Teacher teacherCreateMapper(TeacherDTO teacherDTO) {
        Teacher teacher = new Teacher();
        teacher.setLastName(teacherDTO.getLastName());
        teacher.setFirstName(teacherDTO.getFirstName());
        teacher.setBirthDate(teacherDTO.getBirthDate());
        teacher.setAcademicRank(teacherDTO.getAcademicRank());
        teacher.setDegree(teacherDTO.getDegree());
        Department department = new Department();
        department.setId(teacherDTO.getId());
        teacher.setDepartment(department);
        return teacher;
    }
}
