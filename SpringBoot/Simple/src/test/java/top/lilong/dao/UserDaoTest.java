package top.lilong.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.junit.Assert.*;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/23 17:24
 * @注释
 */
public class UserDaoTest {

 @Autowired
 private  UserDao userDao;
   @Test
  public  void first(){
    System.out.println(userDao.selectAll());
   }
}