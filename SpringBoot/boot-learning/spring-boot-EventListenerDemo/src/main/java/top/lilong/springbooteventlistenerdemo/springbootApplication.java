package top.lilong.springbooteventlistenerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import top.lilong.springbooteventlistenerdemo.eventListenerPackage.MyListener1;
import top.lilong.springbooteventlistenerdemo.eventPackage.MyEvent;

@SpringBootApplication
public class springbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(springbootApplication.class, args);
        context.addApplicationListener(new MyListener1());
        context.publishEvent(new MyEvent("测试事件"));
    }

}
