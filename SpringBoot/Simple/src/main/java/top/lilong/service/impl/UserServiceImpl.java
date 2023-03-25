package top.lilong.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lilong.dao.UserDao;
import top.lilong.domain.User;
import top.lilong.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

 @Autowired
    private UserDao userDao;

    @Override
    public Integer select(String name, String password) {

        return userDao.select(name,password);

    }
    public List<User> selectAll(){
        List<User> list=new ArrayList<>();
        list=userDao.selectAll();
        return list;
    }

    @Override
    public Integer insert(String name, String password) {
        Integer insert = userDao.insert(name, password);
        return insert;
    }

    @Override
    public void del(Integer id) {
        userDao.del(id);
    }

    @Override
    public Integer selectByName(String name) {

      return   userDao.selectByName(name);
    }

    @Override
    public User selectByName2(String name) {

        return userDao.selectByName2(name);

    }
}
