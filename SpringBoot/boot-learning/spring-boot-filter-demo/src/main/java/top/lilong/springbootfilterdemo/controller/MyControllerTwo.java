package top.lilong.springbootfilterdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/27 16:07
 * @注释
 */
@Controller
//@RequestMapping("api")
public class MyControllerTwo {
  @GetMapping("one")
 public String aa(){
   return "index.html";
  }
  @GetMapping("/login")
    public String indexPage(Model model){
      model.addAttribute("msg","Spring 拦截器学习");
      return "login.html";
  }

//  @GetMapping("/api/")
//    public String bb(Model model){
////      model
//  }
}
