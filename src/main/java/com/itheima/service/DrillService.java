package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Drill;
import com.itheima.domain.Holiday;
import com.itheima.domain.Student;

public interface DrillService extends IService<Drill> {
    boolean save(Drill drill);
    boolean modify(Drill drill);
    boolean delete(Integer id);
    Drill select(Integer id);
    IPage<Drill> Selectget(int currentPage, int pageSize, Drill drill);
}
