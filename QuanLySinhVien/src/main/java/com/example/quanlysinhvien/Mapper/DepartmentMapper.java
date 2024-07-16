package com.example.quanlysinhvien.Mapper;

import com.example.quanlysinhvien.DTO.DepartmentDTO;
import com.example.quanlysinhvien.Entity.Department;

public class DepartmentMapper {

    public Department departmentCreateMapper(DepartmentDTO departmentDTO) {
        Department department = new Department();
        department.setName(departmentDTO.getName());
        return department;

    }
}
