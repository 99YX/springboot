package com.yanxin.study.service.impl;

import com.yanxin.study.entity.User;
import com.yanxin.study.mapper.UserMapper;
import com.yanxin.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
   @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    public Integer insert(User user)
    {
        //如果传过来的id是空新增，否则是更新
        if(user.getId()==null)
        {
            return userMapper.insert(user);
        }
        else {

            return  userMapper.update(user);
        }


    }
}
