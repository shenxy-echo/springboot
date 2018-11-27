package com.shenxy.springboot.service;

import com.shenxy.springboot.pojo.PageBean;
import com.shenxy.springboot.pojo.User;

import java.util.List;

/**
 * created by 沈小云 on 2018/9/11  19:02
 */
public interface UserService {
    public void insert(User user);
    public void update(User user);
    public void delete(Long[] ids);
    public User query(int id);
    public List<User> queryAll();

    public PageBean<User> getPageData(int pageNum, int numPerPage);
}
