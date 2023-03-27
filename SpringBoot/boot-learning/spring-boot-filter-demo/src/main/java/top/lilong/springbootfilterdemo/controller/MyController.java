package top.lilong.springbootfilterdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/27 14:42
 * @注释
 */
@RestController
@RequestMapping("api")
public class MyController  {
    @GetMapping("request")
    public void testquest(){
        HttpServletRequest request=((ServletRequestAttributes)(RequestContextHolder.currentRequestAttributes())).getRequest();
        request.setAttribute("author","aaa");
//        request.setAttribute("author","bbb");
        request.removeAttribute("author");

    }
}
