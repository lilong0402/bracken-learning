package top.lilong.spring.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDITest {
    public static void main(String[] args) {
        String xmlPath ="/application.xml";
        //创建Spring核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService)ac.getBean("userService");
        userService.say();
    }
}
