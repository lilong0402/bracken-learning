package top.lilong.service;


import top.lilong.domain.User;

import java.util.List;


public interface UserService {
    Integer select(String name,String password);
    List<User> selectAll();
    Integer insert(String name,String password);
    void del(Integer id);

    Integer selectByName(String name);

    User selectByName2(String name);
}
