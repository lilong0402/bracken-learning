package top.lilong.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.lilong.dao.UserDao;
import top.lilong.domain.User;
import top.lilong.service.UserService;

import static org.junit.Assert.*;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/23 17:08
 * @注释
 */
public class UserServiceImplTest {

 @Autowired
 public UserServiceImpl userService;
 @Test
 public void sss(){

  Integer zhangsan = userService.selectByName("zhangsan");
  System.out.println(zhangsan);
 }

}