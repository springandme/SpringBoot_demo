package com.liushi.controller;

import com.liushi.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName Quick2Controller
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/12 10:33
 * @Version V1.0
 **/
// @Controller
public class Quick2Controller {

    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    @Autowired
    private List<Student> list;


    @RequestMapping("/myQuick")
    @ResponseBody
    public String quick() {
        //获得yml配置文件信息
        return "name: |  " + " |  " + name + " |  " + addr + " |  " + list + " |  ";
    }
}
