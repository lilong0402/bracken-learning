package top.lilong.springbootfilterdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBootFilterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFilterDemoApplication.class, args);
    }

}
