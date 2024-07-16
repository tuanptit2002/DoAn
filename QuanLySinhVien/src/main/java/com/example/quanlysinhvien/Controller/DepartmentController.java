package com.example.quanlysinhvien.Controller;

import com.example.quanlysinhvien.DTO.DepartmentDTO;
import com.example.quanlysinhvien.DTO.ResponseDTO;
import com.example.quanlysinhvien.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping
    public ResponseDTO<?> createDepartment(@RequestBody DepartmentDTO department) {
        return departmentService.createDepartment(department);
    }

    @PutMapping("/{id}")
    public ResponseDTO<?> updateDepartment(@RequestBody DepartmentDTO department, @PathVariable int id) {
        department.setId(id);
        return departmentService.updateDepartment(department);
    }


    @GetMapping("/{id}")
    public ResponseDTO<?> getOneDepartment( @PathVariable int id) {
        return departmentService.getOneDepartment(id);
    }

    @DeleteMapping("/{id}")
    public ResponseDTO<?> deleteDepartment(@PathVariable int id) {
        return departmentService.deleteDepartment(id);
    }
}
