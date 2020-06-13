package com.liushi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liushi.dao.UserDao;
import com.liushi.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ClassName RedisTest
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/12 12:18
 * @Version V1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class RedisTest {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private UserDao userDao;

    @Test
    public void testRedis() throws JsonProcessingException {
        //1.从Redis中获得数据,数据的形式一般是json字符串
        String userListJson = redisTemplate.boundValueOps("user.findAll").get();
        //2.判断Redis中是否存在数据
        if (null == userListJson) {
            //3.如果不存在数据,从数据库查询
            List<User> users = userDao.findAll();
            //4将查询出得数据存储到Redis缓存中
            //4.1先将list集合展缓为json格式的字符串
            ObjectMapper objectMapper = new ObjectMapper();
            userListJson = objectMapper.writeValueAsString(users);
            //4.2将数据存储到redis中，下次在查询直接从redis中获得数据，不用在查询数据库
            redisTemplate.boundValueOps("user.findAll").set(userListJson);
            System.out.println("=========从数据库中获得user的数据==========");
        } else {
            System.out.println("=========从Redis缓存中获得user的数据========");
        }
        //5.将数据在控制台打印
        System.out.println(userListJson);


//
//        =========从数据库中获得user的数据==========
//      [{"id":1,"username":"zhangsan","password":"123","name":"张三"},{"id":2,"username":"lisi","password":"123",
//      "name":"李四"}]


//        =========从Redis缓存中获得user的数据========
//      [{"id":1,"username":"zhangsan","password":"123","name":"张三"},{"id":2,"username":"lisi","password":"123",
//      "name":"李四"}]
    }
}
