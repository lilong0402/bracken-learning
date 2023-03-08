package top.lilong.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public void  setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public void save() {
        this.userDao.save();
        System.out.println("userService...save...");
    }



    
}
