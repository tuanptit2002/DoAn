package com.example.quanlysinhvien.Controller;

import com.example.quanlysinhvien.DTO.ResponseDTO;
import com.example.quanlysinhvien.DTO.StudentDTO;
import com.example.quanlysinhvien.Mapper.StudentMapper;
import com.example.quanlysinhvien.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public ResponseDTO<?> createStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.createStudent(new StudentMapper().studentMapper(studentDTO));
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateStudent(@RequestBody StudentDTO studentDTO) {
        return studentService.updateStudent(new StudentMapper().studentMapper(studentDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<StudentDTO> getStudent(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<StudentDTO>> getAllStudent() {
        return studentService.getAllStudent();
    }

}
