package top.lilong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import top.lilong.entity.User;

@Controller
public class TestController {
    @GetMapping("/test")
    public ModelAndView test(String username,String password){
        ModelAndView modelAndView= new ModelAndView("/WEB-INF/jsp/first.jsp");
        modelAndView.addObject("user",new User(username,password));
        return modelAndView;
    }

}
