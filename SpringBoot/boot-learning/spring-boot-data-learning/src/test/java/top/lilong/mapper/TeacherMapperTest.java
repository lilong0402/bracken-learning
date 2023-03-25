package top.lilong.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.lilong.damain.Teacher;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherMapperTest {

    @Resource
    private TeacherMapper teacherMapper;
    @Test
    void selectOneByOne(){
        Teacher teacher = teacherMapper.selectOneByOne(1);
        System.out.println(teacher);
    }
    @Test
    void findStudentByTeacher(){
        System.out.println(teacherMapper.findStudentByTeacher(2));
    }
}