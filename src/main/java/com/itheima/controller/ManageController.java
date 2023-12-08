package com.itheima.controller;
import com.itheima.domain.Manage;
import com.itheima.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manage")
public class ManageController {
    @Autowired
    private ManageService manageService;
    @PostMapping
    public Boolean save(@RequestBody Manage manage){
        return manageService.save(manage);
    }

    @PutMapping
    public Boolean update(@RequestBody Manage manage){
        return manageService.modify(manage);
    }

    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return manageService.delete(id);
    }
    @GetMapping("{id}")
    public Manage select(@PathVariable Integer id){
        return manageService.select(id);
    }
}
