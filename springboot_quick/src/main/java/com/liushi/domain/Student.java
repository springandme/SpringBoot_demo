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
// 注意:使用@ConfigurationProperties注解需要导入它的依赖spring-boot-configuration-processor
/*
    @ConfigurationProperties注解并且使用prefix来指定一个前缀
    该类中的属性就是配置中去掉前缀的名字,
    即:前缀名+属性名就是配置文件中定义的key,同时,该类上面需要加上@Component注解,把该类作为组件放到Spring容器中,
    yml配置中如下
#配置数据,集合(对象数据)
student:
  - name: tom
    age:  19
    addr: beijing
  - name: lucky
    age:  18
    addr: tianjin
 */
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
