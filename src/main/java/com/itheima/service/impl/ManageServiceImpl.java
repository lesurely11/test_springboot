package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.DrillDao;
import com.itheima.dao.ManagerDao;
import com.itheima.domain.Drill;
import com.itheima.domain.Manage;
import com.itheima.domain.Student;
import com.itheima.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageServiceImpl extends ServiceImpl<ManagerDao, Manage>implements ManageService {
    @Autowired
    private ManagerDao managerDao;
    @Override
    public boolean save(Manage manage) {
        return managerDao.insert(manage) > 0;
    }

    @Override
    public boolean modify(Manage manage) {
        return managerDao.updateById(manage) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return managerDao.deleteById(id) > 0;
    }

    @Override
    public Manage select(Integer id) {
        return managerDao.selectById(id);
    }

}
