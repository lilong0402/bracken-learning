package top.lilong.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClazzMapperTest {

    @Resource
    private ClazzMapper clazzMapper;
    @Test
    void selectOneToMany(){
        System.out.println(clazzMapper.selectOneToMany(1));
    }
}