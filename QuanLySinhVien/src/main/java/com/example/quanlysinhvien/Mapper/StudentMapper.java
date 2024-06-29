package com.example.quanlysinhvien.Mapper;

import com.example.quanlysinhvien.DTO.*;
import com.example.quanlysinhvien.Entity.*;
import com.example.quanlysinhvien.Entity.Class;

import java.util.ArrayList;
import java.util.List;


public class StudentMapper {

    public Student studentMapper(StudentDTO studentDTO) {
        Student student = new Student();
        student.setLastName(studentDTO.getLastName());
        student.setFirstName(studentDTO.getFirstName());
        student.setBirthDate(studentDTO.getBirthDate());
        student.setHomeTown(studentDTO.getHomeTown());
        if(studentDTO.getClassDTO().getId() != null){
            Class aClass = new Class();
            aClass.setId(studentDTO.getClassDTO().getId());
            student.setAClass(aClass);
        }
        if(studentDTO.getStatisticalDTO().getId() != null){
            Statistical statistical = new Statistical();
            statistical.setId(studentDTO.getStatisticalDTO().getId());
            student.setStatistical(statistical);
        }
        if(studentDTO.getSubjectDTOS().size() > 0){
            List<Subject> subjectList = new ArrayList<>();
            for (SubjectDTO subjectDTO : studentDTO.getSubjectDTOS()){
                Subject subject = new Subject();
                subject.setId(subjectDTO.getId());
                subjectList.add(subject);
            }
            student.setSubjects(subjectList);
        }
        if(studentDTO.getPointDTOS().size() > 0){
            List<Point> pointList = new ArrayList<>();
            for(PointDTO pointDTO : studentDTO.getPointDTOS()){
                Point point = new Point();
                point.setId(pointDTO.getId());
                pointList.add(point);
            }
            student.setPoints(pointList);
        }
        if(studentDTO.getTeacherDTOS().size() > 0){
            List<Teacher> teacherList = new ArrayList<>();
            for(TeacherDTO teacherDTO : studentDTO.getTeacherDTOS()){
                Teacher teacher = new Teacher();
                teacher.setId(teacherDTO.getId());
                teacherList.add(teacher);
            }
            student.setTeachers(teacherList);
        }

        return student;
    }

    public StudentDTO studentDTOMapper(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setLastName(student.getLastName());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setBirthDate(student.getBirthDate());
        studentDTO.setHomeTown(student.getHomeTown());
        if(student.getAClass() != null){
            ClassDTO classDTO = new ClassDTO();
            classDTO.setId(student.getAClass().getId());
            studentDTO.setClassDTO(classDTO);
        }
        if(student.getStatistical().getId() != null){
            StatisticalDTO statisticalDTO = new StatisticalDTO();
            statisticalDTO.setId(student.getStatistical().getId());
            studentDTO.setStatisticalDTO(statisticalDTO);
        }
        if(student.getSubjects().size() > 0){
            List<SubjectDTO> subjectDTOS = new ArrayList<>();
            for (Subject subject : student.getSubjects()){
                SubjectDTO subjectDTO = new SubjectDTO();
                subjectDTO.setId(subject.getId());
                subjectDTOS.add(subjectDTO);
            }
            studentDTO.setSubjectDTOS(subjectDTOS);
        }
        if(student.getPoints().size() > 0){
            List<PointDTO> pointDTOS = new ArrayList<>();
            for(Point point : student.getPoints()){
                PointDTO pointDTO = new PointDTO();
                pointDTO.setId(point.getId());
                pointDTOS.add(pointDTO);
            }
            studentDTO.setPointDTOS(pointDTOS);
        }
        if(student.getTeachers().size() > 0){
            List<TeacherDTO> teacherDTOS = new ArrayList<>();
            for(Teacher teacher : student.getTeachers()){
                TeacherDTO teacherDTO = new TeacherDTO();
                teacherDTO.setId(teacher.getId());
                teacherDTOS.add(teacherDTO);
            }
            studentDTO.setTeacherDTOS(teacherDTOS);
        }

        return studentDTO;
    }
}
