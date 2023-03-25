package top.lilong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import top.lilong.domain.User;
import top.lilong.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class UserController {
    @Autowired
    public UserService userService;
    @GetMapping("/one")
    public ModelAndView pipei(@RequestParam("userName") String name, @RequestParam("password") String password,HttpServletRequest request){
        Integer select=userService.select(name,password);
        HttpSession session = request.getSession();
        ModelAndView modelAndView = new ModelAndView();
        if (select!=null) {
            session.setAttribute("a","a");
            System.out.println(session.getAttribute("a"));
            modelAndView.setViewName("/page/index.html");
        }else {
            modelAndView.setViewName("/page/error.html");
        }
        return modelAndView;
    }

    @RequestMapping("/two")
    @ResponseBody
    public List<User> viewone(){
        List<User> list = userService.selectAll();
//        System.out.println(list);
        return list;
    }
    @RequestMapping("/three")
    public ModelAndView insertone(@RequestParam("name") String name,@RequestParam("password") String password)  {
        Integer select = userService.select(name, password);
        ModelAndView modelAndView= new ModelAndView();

        if (select==null)
        userService.insert(name,password);
         modelAndView.setViewName("/page/viewUser.html");
         return modelAndView;
    }
    @RequestMapping("/four")
    public ModelAndView del(String id){
        userService.del(Integer.parseInt(id));
        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("/page/viewUser.html");
        return modelAndView;
    }

    @RequestMapping("/selectbyname")
    @ResponseBody
    public String sbn(String name){

        Integer integera = userService.selectByName(name);
        if (integera!=null){
            return "success";
        }
        else
            return "false";
    }
    @RequestMapping("/selectbyname2")
    @ResponseBody
    public User sbb(String name){

//        System.out.println(name);
        User name2 = userService.selectByName2(name);
//        System.out.println(name2);

        return name2;
    }




}
