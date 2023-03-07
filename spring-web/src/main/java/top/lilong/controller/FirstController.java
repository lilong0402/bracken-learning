package top.lilong.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import top.lilong.entity.Student;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import top.lilong.entity.User;

public class FirstController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //创建模型试图对象
        ModelAndView modelAndView = new ModelAndView();
        //向模型中添加数据
//        modelAndView.addObject("msg","我的第一个Spring MVC 应用");
//        modelAndView.addObject("aaa", new Student("张三",20).toString());
        modelAndView.addObject("username","admin");
        modelAndView.addObject("password",123456);
        //设置试图名称
        modelAndView.setViewName("/WEB-INF/jsp/first.jsp");
        return  modelAndView;
    }
}
