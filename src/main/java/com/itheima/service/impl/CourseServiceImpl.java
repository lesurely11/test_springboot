package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.CourseDao;
import com.itheima.domain.Course;
import com.itheima.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseDao, Course> implements CourseService {
    @Autowired
    private CourseDao courseDao;
    @Override
    public boolean save(Course course) {
        return courseDao.insert(course) > 0;
    }

    @Override
    public boolean modify(Course course) {
        return courseDao.updateById(course) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return courseDao.deleteById(id) > 0;
    }

    @Override
    public Course select(Integer id) {
        return courseDao.selectById(id);
    }

    @Override
    public IPage<Course> Selectget(int currentPage, int pageSize, Course course) {
        LambdaQueryWrapper<Course> lqw = new LambdaQueryWrapper<Course>();
        lqw.like(course.getCourseStudent()!=null ,Course::getCourseStudent,course.getCourseStudent());
        lqw.like(course.getCourseName()!=null ,Course::getCourseName,course.getCourseName());
        lqw.like(course.getCourseDrill()!=null ,Course::getCourseDrill,course.getCourseDrill());
        lqw.like(course.getCourseStudentid()!=null,Course::getCourseStudentid,course.getCourseStudentid());
        IPage page = new Page(currentPage,pageSize);
        courseDao.selectPage(page,lqw);
        return page;
    }
}
