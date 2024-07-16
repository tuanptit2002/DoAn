package com.example.quanlysinhvien.Service.imp;

import com.example.quanlysinhvien.DTO.ResponseDTO;
import com.example.quanlysinhvien.DTO.TeacherDTO;
import com.example.quanlysinhvien.Entity.Department;
import com.example.quanlysinhvien.Entity.Teacher;
import com.example.quanlysinhvien.Mapper.TeacherMapper;
import com.example.quanlysinhvien.Repository.TeacherRepository;
import com.example.quanlysinhvien.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImp implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public ResponseDTO<?> createTeacher(TeacherDTO teacherDTO) {
        Teacher teacher = teacherRepository.save(new TeacherMapper().teacherCreateMapper(teacherDTO));
        return new ResponseDTO<>(teacher, "teacher created successfully");
    }

    @Override
    public ResponseDTO<?> updateTeacher(TeacherDTO teacherDTO) {
        Teacher teacher = teacherRepository.findById(teacherDTO.getId()).get();
        teacher.setLastName(teacherDTO.getLastName());
        teacher.setFirstName(teacherDTO.getFirstName());
        teacher.setBirthDate(teacherDTO.getBirthDate());
        teacher.setAcademicRank(teacherDTO.getAcademicRank());
        teacher.setDegree(teacherDTO.getDegree());
        Department department = new Department();
        department.setId(teacherDTO.getId());
        teacher.setDepartment(department);
        teacherRepository.save(teacher);
        return new ResponseDTO<>(teacher, "teacher updated successfully");
    }

    @Override
    public ResponseDTO<?> getOneTeacher(int id) {
        Teacher teacher = teacherRepository.findById(id).get();
        return new ResponseDTO<>(teacher, "teacher found");
    }

    @Override
    public ResponseDTO<?> deleteTeacher(int id) {
        teacherRepository.deleteById(id);
        return new ResponseDTO<>("teacher deleted successfully");
    }
}
