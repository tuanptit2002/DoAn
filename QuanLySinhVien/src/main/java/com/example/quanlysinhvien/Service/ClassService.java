package com.example.quanlysinhvien.Service;

import com.example.quanlysinhvien.DTO.ClassDTO;
import com.example.quanlysinhvien.DTO.ResponseDTO;
import org.springframework.stereotype.Service;

@Service
public interface ClassService {

    public ResponseDTO<?> createClass(ClassDTO classDTO);
    public ResponseDTO<?> updateClass(ClassDTO classDTO);
    public ResponseDTO<?> deleteClass(int id);
    public ResponseDTO<?> getOneClass(int id);
}
