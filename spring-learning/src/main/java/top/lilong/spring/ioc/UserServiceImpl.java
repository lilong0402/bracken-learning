package top.lilong.spring.ioc;

public class UserServiceImpl implements UserService{
    private UserDao userDao;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void say() {
        this.userDao.say();
        System.out.println("userService say hello world!");
        System.out.println(message);
    }
}
