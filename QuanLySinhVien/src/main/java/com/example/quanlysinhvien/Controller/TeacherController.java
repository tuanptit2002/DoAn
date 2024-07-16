package com.example.quanlysinhvien.Controller;

import com.example.quanlysinhvien.DTO.ResponseDTO;
import com.example.quanlysinhvien.DTO.TeacherDTO;
import com.example.quanlysinhvien.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    public ResponseDTO<?> createClass(@RequestBody TeacherDTO teacherDTO) {
        return teacherService.createTeacher(teacherDTO);
    }

    @PutMapping("/{id}")
    public ResponseDTO<?> updateClass(@RequestBody TeacherDTO teacherDTO,
                                      @PathVariable int id) {
        teacherDTO.setId(id);
        return teacherService.updateTeacher(teacherDTO);
    }

    @GetMapping("/{id}")
    public ResponseDTO<?> getOneClass(@PathVariable int id) {
        return teacherService.getOneTeacher(id);
    }

    @DeleteMapping("/{id}")
    public ResponseDTO<?> deleteClass(@PathVariable int id) {
        return teacherService.deleteTeacher(id);
    }
}
