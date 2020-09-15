package com.liushi.controller;

import com.liushi.dao.CourseBaseRepository;
import com.liushi.domain.CourseBase;
import com.liushi.response.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author liushi
 * @Date 2020/9/15 10:44
 * @Version V1.0
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private CourseBaseRepository courseBaseRepository;

    @RequestMapping("/log")
    public JsonResult testLog() {
        LOGGER.debug("------测试日志debug级别打印-------");
        LOGGER.info("------测试日志info级别打印-------");
        LOGGER.warn("------测试日志warn级别打印-------");
        LOGGER.error("------测试日志error级别打印-------");

        // 可以使用占位符打印出一些参数信息  在字符窜中使用{} 表示占位符
        String str1 = "www.hliushi.cn";
        String str2 = "https://github.com/springandme";
        LOGGER.info("------黄六石的个人博客 {}---:GitHub的地址{}", str1, str2);
        return new JsonResult("10000", "success!");
    }

    @RequestMapping("/find/list")
    public JsonResult<List> findAll() {
        List<CourseBase> list = courseBaseRepository.findAll();
        return new JsonResult<>(list, "success!");
    }

}
