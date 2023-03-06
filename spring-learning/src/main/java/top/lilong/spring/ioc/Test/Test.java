package top.lilong.spring.ioc.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.lilong.spring.ioc.UserDao;
import top.lilong.spring.ioc.entity.Book;
import top.lilong.spring.ioc.entity.Cat;
import top.lilong.spring.ioc.entity.Dog;
import top.lilong.spring.ioc.entity.Person;

public class Test {
    String xmlPath = "/application.xml";
     ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
    public static void main(String[] args) {
        Test test = new Test();
        test.animal();
        test.clothesTest();
        test.bookTest();
    }
    private void animal(){
        Cat cat = ac.getBean("cat", Cat.class);
        Dog dog = ac.getBean("dog", Dog.class);
        System.out.println(cat.toString());
        System.out.println(dog.toString());
    }
    private  void clothesTest(){
        String xmlPath = "/application.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(ac.getBean("person1", Person.class).dress().toString());
        System.out.println(ac.getBean("person2", Person.class).dress().toString());

    }
    private  void bookTest(){
        System.out.println(ac.getBean("book", Book.class).toString());
        System.out.println(ac.getBean("book2", Book.class).toString());
    }
    private void iocTest(){
        UserDao userDao = (UserDao)ac.getBean("userDao");
        userDao.say();
    }


}
