package com.liushi;

import com.liushi.dao.UserDao;
import com.liushi.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class SpringbootJpaApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void findAll() {
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
//        Hibernate: select user0_.id as id1_0_, user0_.name as name2_0_, user0_.password as password3_0_, user0_
//          .username as username4_0_ from user user0_
//        User{id=1, username='zhangsan', password='123', name='张三'}
//        User{id=2, username='lisi', password='123', name='李四'}
    }

    @Test
    public void testFindALl() {
        List<User> list = userDao.findAll();
        list.forEach(System.out::println);
    }
}
