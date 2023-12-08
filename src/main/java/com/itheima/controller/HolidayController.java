package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Holiday;
import com.itheima.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/holiday")
public class HolidayController {
    @Autowired
    private HolidayService holidayService;

    @PostMapping
    public Boolean save(@RequestBody Holiday holiday){
        return holidayService.save(holiday);
    }

    @PutMapping
    public Boolean update(@RequestBody Holiday holiday){
        return holidayService.modify(holiday);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return holidayService.delete(id);
    }

    @PostMapping("{currentPage}/{pageSize}")
    public IPage<Holiday> SelectPage(@PathVariable int currentPage, @PathVariable int pageSize, @RequestBody Holiday holiday){
        return holidayService.Selectget(currentPage,pageSize,holiday);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Holiday> getAllPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return holidayService.getAllPage(currentPage,pageSize);
    }


}
