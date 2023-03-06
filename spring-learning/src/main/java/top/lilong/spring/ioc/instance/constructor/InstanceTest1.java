package top.lilong.spring.ioc.instance.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans1.xml");
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.printf(bean1.toString());
    }
}
