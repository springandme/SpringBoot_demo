package com.liushi.config;

import com.liushi.serivce.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName JavaConfig
 * @Description TODO
 * @Author liushi
 * @Date 2020/9/14 19:11
 * @Version V1.0
 **/
//新建一个类,但是不使用@Service和@Component注解,也可以将一个普通类让spring容器去管理
//@Configuration表示该类是一个配置类,
@Configuration
public class JavaConfig {

    //@Bean表示该方法返回一个Bean,这样就把TestService作为Bean让Spring去管理了
    @Bean
    public TestService getTestService() {
        return new TestService();
    }

}
