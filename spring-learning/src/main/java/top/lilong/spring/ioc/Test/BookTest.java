package top.lilong.spring.ioc.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lilong.spring.ioc.entity.Book;

public class BookTest {
    public static void main(String[] args) {
        String xmlPath = "/application.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(ac.getBean("book", Book.class).toString());
        System.out.println(ac.getBean("book2", Book.class).toString());

    }
}
