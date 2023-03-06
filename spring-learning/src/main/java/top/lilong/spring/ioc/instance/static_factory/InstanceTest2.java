package top.lilong.spring.ioc.instance.static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean2.xml");
        System.out.printf(context.getBean("bean2", Bean2.class).toString());
    }
}
