package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Holiday;
import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public Boolean save(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping
    public Boolean update(@RequestBody Student student){
        return studentService.modify(student);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return studentService.delete(id);
    }
    @GetMapping("{id}")
    public Student select(@PathVariable Integer id){
        return studentService.select(id);
    }
    @PostMapping("{currentPage}/{pageSize}")
    public IPage<Student> SelectPage(@PathVariable int currentPage, @PathVariable int pageSize, @RequestBody Student student){
        return studentService.Selectget(currentPage,pageSize,student);
    }

}
