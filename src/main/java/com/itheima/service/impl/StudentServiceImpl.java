package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.StudentDao;
import com.itheima.domain.Holiday;
import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public boolean save(Student student) {
        return studentDao.insert(student) > 0;
    }

    @Override
    public boolean modify(Student student) {
        return studentDao.updateById(student) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return studentDao.deleteById(id) > 0;
    }

    @Override
    public Student select(Integer id) {
        return studentDao.selectById(id);
    }

    public IPage<Student> Selectget(int currentPage, int pageSize, Student student) {
        LambdaQueryWrapper<Student> lqw = new LambdaQueryWrapper<Student>();
        lqw.like(student.getDrillNumber()!=null ,Student::getDrillNumber,student.getDrillNumber());
        lqw.like(student.getStudentName()!=null,Student::getStudentName,student.getStudentName());
        lqw.like(student.getStudentLevel()!=null,Student::getStudentLevel,student.getStudentLevel());
        IPage page = new Page(currentPage,pageSize);
        studentDao.selectPage(page,lqw);
        return page;
    }

}
