package top.lilong.controller;

//import com.xxx.springmvc.entity.Student;
//import com.xxx.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.lilong.entity.User;

import java.util.ArrayList;

@Controller
@RequestMapping("/t02")
public class T02Controller {
//    @RequestMapping("/t01")
//    @ResponseBody
//    public String t01test(Model model){
//        model.addAttribute("msg","注解编程");
//        Student zs = new Student("zs", 11);
//        Student ls = new Student("ls", 111);
//        ArrayList<Object> list = new ArrayList<>();
//        list.add(zs);
//        list.add(ls);
//        model.addAttribute("stu",zs);
//        model.addAttribute("stus",list);
//        return "t01first";
//
//    }
//
//
//    @RequestMapping("/t02login")
//    public String t01form(User user,Model model){
//
//        System.out.println(user);
//        model.addAttribute("user",user);
//        return "t03success";
//
//    }
//
//    @RequestMapping("/t03search")
//    public String t03search(@RequestParam(defaultValue = "xxx") String name, String course, @RequestParam List<String> purpose, Model model){
//
//        System.out.println(name);
//        System.out.println(course);
//        model.addAttribute("name",name);
//        model.addAttribute("course",course);
//        model.addAttribute("purpose",purpose);
////        for (Integer p : purpose) {
////            System.out.println(p);
////        }
//        for (String s : purpose) {
//            System.out.println(s);
//        }
//        return "t06success";
//    }

    @RequestMapping("/t04ftl")
    public String t04stl(Model model){
        User user1 = new User("张三", "123456");
        User user2 = new User("李四", "123321");
        User user3 = new User("ws", "11111");
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(user1);
        objects.add(user2);
        objects.add(user3);
        model.addAttribute("users",objects);
        return "/WEB-INF/ftl/test";

    }
}
