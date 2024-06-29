package com.example.quanlysinhvien.Service.imp;

import com.example.quanlysinhvien.DTO.StudentDTO;
import com.example.quanlysinhvien.Entity.Statistical;
import com.example.quanlysinhvien.Entity.Student;
import com.example.quanlysinhvien.Mapper.StudentMapper;
import com.example.quanlysinhvien.Repository.StudentRepository;
import com.example.quanlysinhvien.Service.StatisticalService;
import com.example.quanlysinhvien.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    public ResponseEntity<?> updateStudent(Student student) {
        Student studentUpdate = studentRepository.findById(student.getId()).get();
        if(studentUpdate == null){
            throw new RuntimeException("Student not found");
        }
        studentUpdate.setLastName(student.getLastName());
        studentUpdate.setFirstName(student.getFirstName());
        studentUpdate.setBirthDate(student.getBirthDate());
        studentUpdate.setHomeTown(student.getHomeTown());
        studentRepository.save(studentUpdate);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> deleteStudent(int id) {
        Student student = studentRepository.findById(id).get();
        if(student == null){
            throw new RuntimeException("Student not found");
        }
        studentRepository.delete(student);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<StudentDTO>> getAllStudent() {
        List<Student> students = studentRepository.findAll();
        List<StudentDTO> studentDTOList = new ArrayList<>();
        for (Student student : students) {
            StudentDTO studentDTO = new StudentMapper().studentDTOMapper(student);
            studentDTOList.add(studentDTO);
        }
        return new ResponseEntity<>(studentDTOList, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<StudentDTO> getStudentById(int id) {
        Student student = studentRepository.findById(id).get();
        StudentDTO studentDTO = new StudentMapper().studentDTOMapper(student);
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
    }
}
