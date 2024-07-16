package com.example.quanlysinhvien.Service;

import com.example.quanlysinhvien.DTO.DepartmentDTO;
import com.example.quanlysinhvien.DTO.ResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    public ResponseDTO<?> createDepartment(DepartmentDTO department);

    public ResponseDTO<?> updateDepartment(DepartmentDTO departmentDTO);

    public ResponseDTO<?> getOneDepartment(int  id);

    public ResponseDTO<?> deleteDepartment(int id);
}
