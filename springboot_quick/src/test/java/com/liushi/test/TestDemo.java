package com.liushi.test;

import com.liushi.serivce.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName TestDemo
 * @Description TODO
 * @Author liushi
 * @Date 2020/9/14 19:15
 * @Version V1.0
 **/
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDemo {

    @Autowired
    private TestService testService;

    @Test
    public void findAll() {
        String one = testService.findById("2018100563");
        System.out.println(one);
    }
}
