package com.example.quanlysinhvien.Service;

import com.example.quanlysinhvien.DTO.DepartmentDTO;
import com.example.quanlysinhvien.DTO.ResponseDTO;
import com.example.quanlysinhvien.DTO.TeacherDTO;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {

    public ResponseDTO<?> createTeacher(TeacherDTO teacherDTO);

    public ResponseDTO<?> updateTeacher(TeacherDTO teacherDTO);

    public ResponseDTO<?> getOneTeacher(int  id);

    public ResponseDTO<?> deleteTeacher(int id);
}
