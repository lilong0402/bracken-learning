package top.lilong.springbootdemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HellowControllerTest {
    @Autowired
    private HellowController hellowController;

    @Test
    void hello(){
        String hello= hellowController.one();
        System.out.println(hello);
    }
}