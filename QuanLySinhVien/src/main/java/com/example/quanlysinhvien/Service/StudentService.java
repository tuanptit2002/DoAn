package com.example.quanlysinhvien.Service;

import com.example.quanlysinhvien.Entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

     public ResponseEntity<?> createStudent(Student student);
}
