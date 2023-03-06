package top.lilong.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssembleTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/beans6.xml");
//        applicationContext.getBean("userController",UserController.class).save();
        applicationContext.getBean("userController",UserController.class).save();
    }
}
