package com.example.quanlysinhvien.Service;

import com.example.quanlysinhvien.DTO.ResponseDTO;
import com.example.quanlysinhvien.Entity.Subject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface SubjectService {

    public ResponseDTO<?> createSubject(Subject subject);
}
