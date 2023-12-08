package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.dao.CourseDao;
import com.itheima.domain.Course;
import com.itheima.domain.Drill;

public interface CourseService extends IService<Course> {
    boolean save(Course course);
    boolean modify(Course course);
    boolean delete(Integer id);
    Course select(Integer id);
    IPage<Course> Selectget(int currentPage, int pageSize,Course course);
}
