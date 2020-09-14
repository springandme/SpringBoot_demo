package com.liushi.controller;

import com.liushi.domain.Student;
import com.liushi.response.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName JsonController
 * @Description 测试Spring Boot 默认对JSON的处理
 * @Author liushi
 * @Date 2020/9/14 19:36
 * @Version V1.0
 **/
@RestController
@RequestMapping("/json")
public class JsonController {

    /**
     * 由于JsonResult使用了泛型,所以所有的返回值类型都可以使用该统一结构,
     * 在具体的场景将泛型替换称具体的数据类型即可,非常方便,也便于维护,
     * 在实际项目中,还可以继续封装,比如状态码和提示信息可以定义一个枚举类型
     * 以后我们只要维护这个枚举类型中的数据即可
     */


    @RequestMapping("/stu")
    public JsonResult<Student> getStu() {
        Student student = new Student("liushi", 22, null);
        return new JsonResult<>(student);
    }

    @RequestMapping("/list")
    public JsonResult<List> getListStu() {
        Student s1 = new Student(null, 23, "chongqing");
        Student s2 = new Student("demo", null, "beijing");
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        return new JsonResult<>(list, "获取学生列表成功!");
    }

    @RequestMapping("/map")
    public JsonResult<Map> getMapStu() {
        Student s1 = new Student("test", 23, null);
        Student s2 = new Student("demo", 23, "shanghai");
        HashMap<String, Student> map = new HashMap<>();
        map.put(s1.getName(), s1);
        map.put(s2.getName(), s2);
        return new JsonResult<>(map);
    }

    /*@RequestMapping("/stu")
    public Student getStu() {
        return new Student("liushi", 22, null);
    }

    @RequestMapping("/list")
    public List<Student> getListStu() {
        Student s1 = new Student(null, 23, "anhui");
        Student s2 = new Student("demo", null, "anhui");
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        return list;
    }

    @RequestMapping("/map")
    public Map<String, Student> getMapStu() {
        Student s1 = new Student("test", 23, "anhui");
        Student s2 = new Student("demo", 23, "anhui");
        HashMap<String, Student> map = new HashMap<>();
        // setNullValueSerializer,设置了key-value串中的value为空,
        // 在HashMap这里设置了key为空,将会出现错误
        map.put(null, s1);
        map.put(s2.getName(), s2);
        return map;
    }*/
}
