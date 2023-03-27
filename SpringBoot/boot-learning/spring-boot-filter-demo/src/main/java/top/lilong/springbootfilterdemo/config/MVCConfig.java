package top.lilong.springbootfilterdemo.config;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.lilong.springbootfilterdemo.interfector.CustomerInterfector;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/27 16:04
 * @注释
 */
@Configuration
public class MVCConfig implements WebMvcConfigurer {

 @Resource
 private CustomerInterfector customerInterfector;

 private String[] excluerpackage={"/static","/templates","/api/login","/one","/static/**"};

 @Override
 public void addInterceptors(InterceptorRegistry registry) {
  registry.addInterceptor(customerInterfector).addPathPatterns("/**").excludePathPatterns(excluerpackage);
 }
}
