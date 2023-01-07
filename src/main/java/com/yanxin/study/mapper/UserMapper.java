package com.yanxin.study.mapper;

import com.yanxin.study.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    /*查询数据库当中的数据*/
    @Select("select * from sys_user")
    public abstract List<User> findAll();
    /*插入数据*/
    @Insert("insert into sys_user(username,password,nickname,email,phone,address) values(#{username},#{password},#{nickname},#{email},#{phone},#{address})")
    public abstract int insert(User user);


   Integer update(User user);
}
