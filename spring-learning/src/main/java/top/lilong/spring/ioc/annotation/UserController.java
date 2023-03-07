package top.lilong.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author 李龙
 *
 */
@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService){
        this.userService=userService;
    }
    public void save(){
        this.userService.save();
        System.out.println("userController...save...");
    }
}
