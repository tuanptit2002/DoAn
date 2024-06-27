package com.example.quanlysinhvien.Service.imp;

import com.example.quanlysinhvien.Entity.Statistical;
import com.example.quanlysinhvien.Entity.Student;
import com.example.quanlysinhvien.Repository.StudentRepository;
import com.example.quanlysinhvien.Service.StatisticalService;
import com.example.quanlysinhvien.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StatisticalService statisticalService;

    @Override
    public ResponseEntity<?> createStudent(Student student) {
        Statistical statistical  = statisticalService.create();
        student.setStatistical(statistical);
        studentRepository.save(student);
        return null;
    }

    public ResponseEntity<?> updateStudent(Student student) {
        Student studentUpdate = studentRepository.findById(student.getId()).get();

        studentRepository.save(studentUpdate);
        return null;
    }
}
