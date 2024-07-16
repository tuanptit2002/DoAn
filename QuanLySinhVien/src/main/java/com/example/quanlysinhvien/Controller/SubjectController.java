package com.example.quanlysinhvien.Controller;

import com.example.quanlysinhvien.DTO.ResponseDTO;
import com.example.quanlysinhvien.DTO.SubjectDTO;
import com.example.quanlysinhvien.Mapper.SubjectMapper;
import com.example.quanlysinhvien.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @PostMapping
    public ResponseDTO<?> createSubject(@RequestBody SubjectDTO subjectDTO) {

        return subjectService.createSubject(new SubjectMapper().subjectCreateMapper(subjectDTO));
    }
}
