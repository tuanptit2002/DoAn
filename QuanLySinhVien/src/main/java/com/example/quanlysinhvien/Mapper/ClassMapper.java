package com.example.quanlysinhvien.Mapper;


import com.example.quanlysinhvien.DTO.ClassDTO;
import com.example.quanlysinhvien.Entity.Class;
import com.example.quanlysinhvien.Entity.Department;

public class ClassMapper {


    public Class classCreateMapper(ClassDTO classDTO){
        Class cls = new Class();
        cls.setName(classDTO.getName());
        Department department = new Department();
        department.setId(classDTO.getDepartmentDTO().getId());
        return cls;
    }

}
