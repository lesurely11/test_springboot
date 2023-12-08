package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

import com.itheima.domain.Book;
import com.itheima.domain.Holiday;


public interface HolidayService extends IService<Holiday> {
    IPage<Holiday> Selectget(int currentPage, int pageSize, Holiday holiday);
    IPage<Holiday> getAllPage(int currentPage, int pageSize);
    boolean save(Holiday holiday);
    boolean modify(Holiday holiday);
    boolean delete(Integer id);
}
