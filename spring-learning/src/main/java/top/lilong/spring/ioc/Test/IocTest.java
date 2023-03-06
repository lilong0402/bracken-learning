package top.lilong.spring.ioc.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lilong.spring.ioc.UserDao;

public class IocTest {
    public static void main(String[] args) {
        String xmlPath = "/application.xml";

        //创建spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);

        UserDao userDao = (UserDao)ac.getBean("userDao");
        userDao.say();
    }
}
