package com.liushi.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName Quick3Controller
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/12 10:39
 * @Version V1.0
 **/
@Controller
@ConfigurationProperties(prefix = "person")
public class Quick3Controller {

    private String name;
    private String addr;
    private Integer age;

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick() {
        //获得yml配置文件信息
        return "name:" + name + addr + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
