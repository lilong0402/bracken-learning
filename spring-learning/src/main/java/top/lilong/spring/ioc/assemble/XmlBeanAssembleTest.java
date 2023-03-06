package top.lilong.spring.ioc.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBeanAssembleTest {
    public static void main(String[] args) {
        String xmlpath="/bean5.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(xmlpath);
        System.out.println(context.getBean("user1"));
        System.out.println(context.getBean("user2"));
        
    }
}
