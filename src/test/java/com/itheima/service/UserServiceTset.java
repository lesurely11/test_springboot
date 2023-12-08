package com.itheima.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Holiday;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTset {
    @Autowired
    private HolidayService holidayService;
    @Test
    void testInsertuser(){
        Holiday holiday = new Holiday();
        //holiday.setStudentName("nance");
        //holiday.setHolidayTime("2022-02");
        QueryWrapper<Holiday> wrapper=new QueryWrapper<>(holiday);
        IPage<Holiday> iPage = holidayService.Selectget(1,5,holiday);
        System.out.println(iPage.getRecords());
    }

    /*void select(){
        Holiday holiday = new Holiday();
        //holiday.setStudentName("nance");
        //holiday.setHolidayTime("2022-02");
        QueryWrapper<Holiday> wrapper=new QueryWrapper<>(holiday);
        IPage<Holiday> iPage = holidayService.getPage(1,5);
        System.out.println(iPage.getRecords());
    }*/

}
