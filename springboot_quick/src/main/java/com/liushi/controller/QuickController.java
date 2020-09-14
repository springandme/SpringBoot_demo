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


    /**
     * 测试:2020年6月21日22:35:26
     * -->  @RequestMapping("/quick")  其中的/quick 可以不带 / ,变成@RequestMapping("quick"),也是能访问到的
     *
     * @return
     */
    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "hello springboot^^---";
    }
}
