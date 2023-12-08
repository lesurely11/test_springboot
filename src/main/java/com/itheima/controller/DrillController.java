package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Drill;
import com.itheima.domain.Student;
import com.itheima.service.DrillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drill")
public class DrillController {
    @Autowired
    private DrillService drillService;
    @PostMapping
    public Boolean save(@RequestBody Drill drill){
        return drillService.save(drill);
    }

    @PutMapping
    public Boolean update(@RequestBody Drill drill){
        return drillService.modify(drill);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return drillService.delete(id);
    }
    @GetMapping("{id}")
    public Drill select(@PathVariable Integer id){
        return drillService.select(id);
    }
    @PostMapping("{currentPage}/{pageSize}")
    public IPage<Drill> SelectPage(@PathVariable int currentPage, @PathVariable int pageSize, @RequestBody Drill drill){
        return drillService.Selectget(currentPage,pageSize,drill);
    }
}
