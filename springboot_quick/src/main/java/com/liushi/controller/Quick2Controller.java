package com.liushi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName Quick2Controller
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/12 10:33
 * @Version V1.0
 **/
@Controller
public class Quick2Controller {

    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    @RequestMapping("/myQuick")
    @ResponseBody
    public String quick() {
        //获得yml配置文件信息
        return "name:" + name + addr;
    }
}
