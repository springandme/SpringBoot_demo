package com.liushi.controller;

import com.liushi.domain.User;
import com.liushi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName MybatisController
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/12 11:15
 * @Version V1.0
 **/
@Controller
public class MybatisController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll() {
        List<User> users = userMapper.findAll();
        return users;
    }
}
