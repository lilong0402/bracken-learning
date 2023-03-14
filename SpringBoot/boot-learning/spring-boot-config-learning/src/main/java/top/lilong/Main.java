package top.lilong;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:bean.xml")
public class Main {
    public static void main(String[] args) {
//        SpringApplication.run(Application.class,args);
        SpringApplication.run(Main.class,args);
    }

}