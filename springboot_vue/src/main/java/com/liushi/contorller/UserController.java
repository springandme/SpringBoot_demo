package com.liushi.contorller;

import com.liushi.domain.User;
import com.liushi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/13 15:59
 * @Version V1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        System.out.println("test");
        return userService.findAll();
    }

    @RequestMapping("/findById")
    public User findById(Integer id) {
        Optional<User> user = userService.findById(id);
        try {
            return user.get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping("/update")
    public void update(User user) {
        userService.update(user);
    }

}
