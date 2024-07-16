package com.example.quanlysinhvien.Controller;

import com.example.quanlysinhvien.DTO.ClassDTO;
import com.example.quanlysinhvien.DTO.ResponseDTO;
import com.example.quanlysinhvien.Service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    @PostMapping
    public ResponseDTO<?> createClass(@RequestBody ClassDTO classDTO) {
        return classService.createClass(classDTO);
    }

    @PutMapping("/{id}")
    public ResponseDTO<?> updateClass(@RequestBody ClassDTO classDTO ,
                                      @PathVariable int id) {
        classDTO.setId(id);
        return classService.updateClass(classDTO);
    }

    @GetMapping("/{id}")
    public ResponseDTO<?> getOneClass(@PathVariable int id) {
        return classService.getOneClass(id);
    }

    @DeleteMapping("/{id}")
    public ResponseDTO<?> deleteClass(@PathVariable int id) {
        return classService.deleteClass(id);
    }
}
