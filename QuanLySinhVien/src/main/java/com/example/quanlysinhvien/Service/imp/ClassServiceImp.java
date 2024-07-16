package com.example.quanlysinhvien.Service.imp;

import com.example.quanlysinhvien.DTO.ClassDTO;
import com.example.quanlysinhvien.DTO.ResponseDTO;
import com.example.quanlysinhvien.Entity.Class;
import com.example.quanlysinhvien.Entity.Department;
import com.example.quanlysinhvien.Mapper.ClassMapper;
import com.example.quanlysinhvien.Repository.ClassRepository;
import com.example.quanlysinhvien.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImp implements ClassService {

    @Autowired
    private ClassRepository classRepository;

    @Override
    public ResponseDTO<?> createClass(ClassDTO classDTO) {
        Class aClass = classRepository.save(new ClassMapper().classCreateMapper(classDTO));
        return new ResponseDTO<>(aClass, "Class created successfully");
    }

    @Override
    public ResponseDTO<?> updateClass(ClassDTO classDTO) {
        Class aClass = classRepository.findById(classDTO.getId()).get();
        Department department = new Department();
        department.setId(classDTO.getDepartmentDTO().getId());
        aClass.setDepartment(department);
        aClass.setName(classDTO.getName());
        classRepository.save(aClass);
        return new ResponseDTO<>(aClass, "Class updated successfully");
    }

    @Override
    public ResponseDTO<?> deleteClass(int id) {
        classRepository.deleteById(id);
        return new ResponseDTO<>("Class deleted successfully");
    }

    @Override
    public ResponseDTO<?> getOneClass(int id) {
        Class aClass = classRepository.findById(id).get();
        return new ResponseDTO<>(aClass, "Class get successfully");
    }
}
