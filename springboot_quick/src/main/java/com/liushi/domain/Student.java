package com.liushi.domain;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liushi
 * @Date 2020/6/21 22:53
 * @Version V1.0
 **/
// @Component
// @ConfigurationProperties(prefix = "student")
public class Student {
    private String name;
    private Integer age;
    private String addr;

    public Student(String name, Integer age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                '}';
    }
}
