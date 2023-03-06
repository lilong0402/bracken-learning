package top.lilong.spring.ioc.instance.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans3.xml");
        System.out.println( context.getBean("bean3", Bean3.class).toString());
    }
}
