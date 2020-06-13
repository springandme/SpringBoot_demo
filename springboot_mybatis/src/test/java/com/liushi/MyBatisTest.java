package com.liushi;

import com.liushi.domain.User;
import com.liushi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName MyBatisTest
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/12 11:50
 * @Version V1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class MyBatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAll() {
        List<User> users = userMapper.findAll();
        users.forEach(System.out::println);
//        User{id=1, username='zhangsan', password='123', name='张三'}
//        User{id=2, username='lisi', password='123', name='李四'}
    }
}
