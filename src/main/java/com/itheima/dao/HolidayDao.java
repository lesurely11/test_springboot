package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Holiday;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HolidayDao extends BaseMapper<Holiday> {
}
