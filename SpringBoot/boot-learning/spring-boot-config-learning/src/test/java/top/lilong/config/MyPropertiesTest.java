package top.lilong.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lilong.prop.MyProperties;

@SpringBootTest
class MyPropertiesTest {

    @Autowired
    private MyProperties myProperties;
    @Test
    public void MyTest(){
        System.out.println(myProperties);
    }
}