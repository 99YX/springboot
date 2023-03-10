package com.yanxin.study.controller;

import com.yanxin.study.entity.User;
import com.yanxin.study.mapper.UserMapper;
import com.yanxin.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> findAll()
    {
        return userService.findAll();

    }

    @PostMapping("/user")
    /*@RequestBody主要用来接收前端传递给后端的json字符串中的数据的(请求体中的数据的)；GET方式无请求体，所以使用@RequestBody接收数据时，前端不能使用GET方式提交数据，而是用POST方式进行提交。在后端的同一个接收方法里，@RequestBody与@RequestParam()可以同时使用，@RequestBody最多只能有一个，而@RequestParam()可以有多个。*/

    public Integer save(@RequestBody User user) {

       return userService.insert(user);
    }
}
