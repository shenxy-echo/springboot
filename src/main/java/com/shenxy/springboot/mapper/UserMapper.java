package com.shenxy.springboot.mapper;

import com.shenxy.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * created by 沈小云 on 2018/9/11  19:08
 */
@Mapper
public interface UserMapper {
    public void insert(User user);
    public void update(User user);
    public void delete(@Param("ids") Long[] id);
    public User query(int id);
    public List<User> queryAll();
}
