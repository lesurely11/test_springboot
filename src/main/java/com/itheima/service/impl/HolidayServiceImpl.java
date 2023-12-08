package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.domain.Holiday;
import com.itheima.dao.HolidayDao;
import com.itheima.domain.Holiday;
import com.itheima.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HolidayServiceImpl extends ServiceImpl<HolidayDao,Holiday> implements HolidayService {
   @Autowired
    private HolidayDao holidayDao;

    @Override
    public IPage<Holiday> Selectget(int currentPage, int pageSize, Holiday holiday) {
        LambdaQueryWrapper<Holiday> lqw = new LambdaQueryWrapper<Holiday>();
        lqw.like(holiday.getStudentName()!=null,Holiday::getStudentName,holiday.getStudentName());
        lqw.like(holiday.getHolidayTime()!=null,Holiday::getHolidayTime,holiday.getHolidayTime());
        lqw.like(holiday.getStudentId()!=0,Holiday::getStudentId,holiday.getStudentId());
        lqw.like(holiday.getDrillId()!=0,Holiday::getDrillId,holiday.getDrillId());
        IPage page = new Page(currentPage,pageSize);
        holidayDao.selectPage(page,lqw);
        return page;
    }
    @Override
    public IPage<Holiday> getAllPage(int currentPage, int pageSize) {
        IPage page = new Page(currentPage,pageSize);
        holidayDao.selectPage(page,null);
        return page;
    }
    @Override
    public boolean save(Holiday holiday) {
        return holidayDao.insert(holiday) > 0;
    }

    @Override
    public boolean modify(Holiday holiday) {
        return holidayDao.updateById(holiday) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return holidayDao.deleteById(id) > 0;
    }


}
