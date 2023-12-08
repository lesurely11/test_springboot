package com.itheima.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.domain.Book;
import com.itheima.domain.Student;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    User login(@RequestBody User user){
        QueryWrapper<User> wrapper=new QueryWrapper<>(user);
        if(userService.getMap(wrapper)!=null)
        {
            User user1=new User();
            Map<String, Object> map = userService.getMap(wrapper);
            user1.setId((Integer) map.get("id"));
            user1.setUsername((String) map.get("username"));
            user1.setTag((Integer) map.get("tag"));
            return user1;
        }else{
            return null;
        }
    }
    @PostMapping("/put")
    public Boolean save(@RequestBody User user){
        return userService.save(user);
    }

}
