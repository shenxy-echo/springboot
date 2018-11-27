package com.shenxy.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.shenxy.springboot.pojo.PageBean;
import com.shenxy.springboot.pojo.User;
import com.shenxy.springboot.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created by 沈小云 on 2018/9/11  19:53
 */
@Controller
@ComponentScan("com.shenxy.springboot.service")
@MapperScan("com.shenxy.springboot.mapper")
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("queryAll")
    public ModelAndView queryAll(){
        ModelAndView mv = new ModelAndView("list");
        List<User> users = userService.queryAll();
        mv.addObject("users",users);
        return mv;
    }

    @RequestMapping("list")
    @ResponseBody
    public PageBean<User> list(@RequestParam(value = "page",defaultValue = "1") int page,
                                                        @RequestParam(value = "rows",defaultValue = "5") int rows){
        return userService.getPageData(page,rows);
    }

    @RequestMapping("edit")
    @ResponseBody
    public Map edit(User  user){
        Map map = new HashMap();
        try{
            userService.update(user);
            map.put("status",200);
        }catch (Exception e){
            map.put("status",500);
        }
        return map;
    }
    @RequestMapping("save")
    @ResponseBody
    public Map save(User  user){
        Map map = new HashMap();
        try{
            userService.insert(user);
            map.put("status",200);
        }catch (Exception e){
            map.put("status",500);
        }
        return map;
    }

    @RequestMapping("delete")
    @ResponseBody
    public Map delete(@RequestParam("ids") Long[] ids){
        Map map = new HashMap();
        try{
            userService.delete(ids);
            map.put("status",200);
        }catch (Exception e){
            map.put("status",500);
        }
        return map;
    }
    @RequestMapping("insert")
    @ResponseBody
    public Map insert() {
        Map map = new HashMap();
        User user = new User();
        try{
            user.setName("222");
            user.setAge(12);
            String birthday = "2018-09-12";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(birthday);
            System.out.println("date =" + date);
            user.setBirthday(date);
            userService.insert(user);
            map.put("status",200);
        }catch (Exception e){
            map.put("status",500);
        }
        return map;
    }


}
