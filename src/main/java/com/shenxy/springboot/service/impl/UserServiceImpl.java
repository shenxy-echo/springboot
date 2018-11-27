package com.shenxy.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shenxy.springboot.mapper.UserMapper;
import com.shenxy.springboot.pojo.PageBean;
import com.shenxy.springboot.pojo.User;
import com.shenxy.springboot.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * created by 沈小云 on 2018/9/11  19:02
 */
@ComponentScan("com.shenxy.springboot.mapper")
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Long[] ids) {
        userMapper.delete(ids);
    }

    @Override
    public User query(int id) {
        return userMapper.query(id);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    @Override
    public PageBean<User> getPageData(int pageNum, int numPerPage) {
        PageHelper.startPage(pageNum,numPerPage);
        List<User> userList = queryAll();
        for (User user : userList) {
            System.out.println(user);
        }
        PageInfo<User> pageInfo = new PageInfo<User>(userList);
        PageBean<User> pageBean = new PageBean<User>(pageInfo.getTotal(),pageInfo.getList());
        return pageBean;
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
