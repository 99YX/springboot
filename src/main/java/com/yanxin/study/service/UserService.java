package com.yanxin.study.service;

import com.yanxin.study.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public  abstract List<User> findAll();

    public abstract  Integer insert(User user);
}
