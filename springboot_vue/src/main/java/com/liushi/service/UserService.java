package com.liushi.service;

import com.liushi.dao.UserDao;
import com.liushi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/13 16:37
 * @Version V1.0
 **/
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Optional<User> findById(Integer id) {
        return userDao.findById(id);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void update(User user) {
        userDao.save(user);
    }
}
