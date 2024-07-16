package com.example.quanlysinhvien.Service.imp;

import com.example.quanlysinhvien.DTO.DepartmentDTO;
import com.example.quanlysinhvien.DTO.ResponseDTO;
import com.example.quanlysinhvien.Entity.Department;
import com.example.quanlysinhvien.Mapper.DepartmentMapper;
import com.example.quanlysinhvien.Repository.DepartmentRepository;
import com.example.quanlysinhvien.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImp implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public ResponseDTO<?> createDepartment(DepartmentDTO department) {
        Department newDepartment = departmentRepository.save(new DepartmentMapper().departmentCreateMapper(department));
        return new ResponseDTO<>(newDepartment, "create department success");
    }

    @Override
    public ResponseDTO<?> updateDepartment(DepartmentDTO departmentDTO){
        Department department = departmentRepository.findById(departmentDTO.getId()).get();
        department.setName(departmentDTO.getName());
        departmentRepository.save(department);
        return new ResponseDTO<>(department, "update department success");
    }

    @Override
    public ResponseDTO<?> getOneDepartment(int id){
        Department department = departmentRepository.findById(id).get();
        return new ResponseDTO<>(department, "getOne department success");
    }

    @Override
    public ResponseDTO<?> deleteDepartment(int id){
        departmentRepository.deleteById(id);
        return new ResponseDTO("delete department success");
    }
}
