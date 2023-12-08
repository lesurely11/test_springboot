package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.DrillDao;
import com.itheima.dao.StudentDao;
import com.itheima.domain.Drill;
import com.itheima.domain.Student;
import com.itheima.service.DrillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrillServiceImpl extends ServiceImpl<DrillDao, Drill> implements DrillService {
    @Autowired
    private DrillDao drillDao;
    @Override
    public boolean save(Drill drill) {
        return drillDao.insert(drill) > 0;
    }

    @Override
    public boolean modify(Drill drill) {
        return drillDao.updateById(drill) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return drillDao.deleteById(id) > 0;
    }

    @Override
    public Drill select(Integer id) {
        return drillDao.selectById(id);
    }
    @Override
    public IPage<Drill> Selectget(int currentPage, int pageSize, Drill drill){
        LambdaQueryWrapper<Drill> lqw = new LambdaQueryWrapper<Drill>();
        lqw.like(drill.getDrillName()!=null ,Drill::getDrillName,drill.getDrillName());
        IPage page = new Page(currentPage,pageSize);
        drillDao.selectPage(page,lqw);
        return page;
    }

}
