package com.liushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName QuickController
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/11 19:02
 * @Version V1.0
 **/
@Controller
public class QuickController {

    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "hello springboot^^---";
    }
}
