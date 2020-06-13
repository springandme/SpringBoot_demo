package com.liushi.dao;

import com.liushi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/12 12:08
 * @Version V1.0
 **/
public interface UserDao extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {


}
