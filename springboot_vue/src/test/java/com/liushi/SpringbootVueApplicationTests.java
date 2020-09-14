package com.liushi;

import com.liushi.dao.UserDao;
import com.liushi.domain.User;
import com.liushi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootVueApplication.class)
public class SpringbootVueApplicationTests {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;

    @Test
    public void findAll() {
        List<User> users = userDao.findAll();
        users.forEach(System.out::println);
    }

    @Test
    public void findById() {
        Optional<User> user = userDao.findById(1);
        System.out.println(user);
    }

    @Test
    public void findAllWithService() {
        Optional<User> user = userService.findById(1);
        System.out.println(user);
    }

}
