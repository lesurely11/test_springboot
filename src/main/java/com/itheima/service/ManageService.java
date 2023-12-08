package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Drill;
import com.itheima.domain.Manage;

public interface ManageService extends IService<Manage> {
    boolean save(Manage manage);
    boolean modify(Manage manage);
    boolean delete(Integer id);
    Manage select(Integer id);


}
