package top.lilong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.lilong.mapper")
public class SpringBootDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataApplication.class,args);

    }
}