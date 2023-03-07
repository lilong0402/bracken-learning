package top.lilong.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.lilong.entity.Student;
import top.lilong.entity.User;

import java.util.ArrayList;

@Controller
public class LoginController {
    @GetMapping("/login")
    public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password){
        ModelAndView modelAndView = new ModelAndView("/logindata.jsp");
        User user = new User(username,password);
        modelAndView.addObject("user","<fieldset><legend>登陆成功</legend>用户名" +user.getUsername() +"<br>密码："+user.getPassword()+"</fieldset>");
        return modelAndView;
    }
//    @ResponseBody
//    public String login(String username, String password){

//    }
//        public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password){
////        ModelAndView modelAndView = new ModelAndView("/logindata.jsp");
////        modelAndView.addObject("username",username);
////        modelAndView.addObject("password",password);
////        return modelAndView;
//    }


}
