package com.example.quanlysinhvien.Mapper;

import com.example.quanlysinhvien.DTO.SubjectDTO;
import com.example.quanlysinhvien.Entity.Subject;

public class SubjectMapper {

    public Subject subjectCreateMapper(SubjectDTO subjectDTO) {
        Subject subject = new Subject();
        subject.setCodeSubject(subjectDTO.getCodeSubject());
        subject.setTitle(subjectDTO.getTitle());
        subject.setName(subjectDTO.getName());
        subject.setCredits(subjectDTO.getCredits());
        subject.setPeriods(subjectDTO.getPeriods());
        return subject;
    }
}
