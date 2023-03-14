package top.lilong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.lilong.service.MyService;

/**
 * 李龙
 */
@Configuration
public class MyConfig {

//    将该方法的返回值作为一个Bean，添加到Spring容器中，该Bean的id就是方法名
    @Bean
    public MyService myService(){
        return new MyService();
    }
}
