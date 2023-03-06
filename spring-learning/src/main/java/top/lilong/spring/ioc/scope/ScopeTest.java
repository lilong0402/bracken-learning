package top.lilong.spring.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        String xmlPath="/bean4.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(context.getBean("scope"));
        System.out.println(context.getBean("scope"));

    }
}
