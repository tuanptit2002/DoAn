package com.example.quanlysinhvien.Controller;

import com.example.quanlysinhvien.DTO.StudentDTO;
import com.example.quanlysinhvien.Mapper.StudentMapper;
import com.example.quanlysinhvien.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<?> createStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.createStudent(new StudentMapper().studentMapper(studentDTO));
    }
}
