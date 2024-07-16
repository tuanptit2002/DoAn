package com.example.quanlysinhvien.Service.imp;

import com.example.quanlysinhvien.DTO.ResponseDTO;
import com.example.quanlysinhvien.Entity.Subject;
import com.example.quanlysinhvien.Repository.SubjectRepository;
import com.example.quanlysinhvien.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImp implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;
    @Override
    public ResponseDTO<?> createSubject(Subject subject) {
        Subject result = subjectRepository.save(subject);
        return new ResponseDTO<>(result,"Subject created successfully");
    }

}
