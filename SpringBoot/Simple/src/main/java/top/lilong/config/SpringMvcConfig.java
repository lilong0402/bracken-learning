package top.lilong.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@ComponentScan({"top.lilong.controller","top.lilong.config"})
@EnableWebMvc
public class SpringMvcConfig  {

}
