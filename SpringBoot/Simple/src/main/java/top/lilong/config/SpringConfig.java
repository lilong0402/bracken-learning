package top.lilong.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"top.lilong.service"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
public class SpringConfig {
}
