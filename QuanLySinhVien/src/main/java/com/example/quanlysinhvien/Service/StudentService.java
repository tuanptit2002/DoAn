package com.example.quanlysinhvien.Service;

import com.example.quanlysinhvien.DTO.StudentDTO;
import com.example.quanlysinhvien.Entity.Student;
import com.example.quanlysinhvien.Mapper.StudentMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

     public ResponseEntity<?> createStudent(Student student);

     public ResponseEntity<?> updateStudent(Student student);

     public ResponseEntity<?> deleteStudent(int id);
     public ResponseEntity<List<StudentDTO>> getAllStudent();
     public ResponseEntity<StudentDTO> getStudentById(int id);
}
