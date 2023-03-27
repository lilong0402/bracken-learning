package top.lilong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @version 1.0
 * @Author 李龙
 * @Date ${DATE} ${TIME}
 * @注释
 */
@SpringBootApplication
@ServletComponentScan
public class SpringBootMain {
    public static void main(String[] args) {

        SpringApplication.run(SpringApplication.class,args);
    }
}