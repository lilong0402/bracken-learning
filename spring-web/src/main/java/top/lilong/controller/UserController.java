package top.lilong.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register.jsp";
    }
}
