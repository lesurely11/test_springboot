package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Course;
import com.itheima.domain.Drill;
import com.itheima.service.CourseService;
import com.itheima.service.DrillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @PostMapping
    public Boolean save(@RequestBody Course course){
        return courseService.save(course);
    }

    @PutMapping
    public Boolean update(@RequestBody Course course){
        return courseService.modify(course);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return courseService.delete(id);
    }
    @GetMapping("{id}")
    public Course select(@PathVariable Integer id){
        return courseService.select(id);
    }
    @PostMapping("{currentPage}/{pageSize}")
    public IPage<Course> SelectPage(@PathVariable int currentPage, @PathVariable int pageSize, @RequestBody Course course){
        return courseService.Selectget(currentPage,pageSize,course);
    }
}
