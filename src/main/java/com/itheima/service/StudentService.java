package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Holiday;
import com.itheima.domain.Student;

public interface StudentService extends IService<Student> {
    boolean save(Student student);
    boolean modify(Student student);
    boolean delete(Integer id);
    Student select(Integer id);
   IPage<Student> Selectget(int currentPage, int pageSize, Student student);
}
