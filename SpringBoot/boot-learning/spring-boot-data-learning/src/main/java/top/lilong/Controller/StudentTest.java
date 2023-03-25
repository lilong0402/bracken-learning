package top.lilong.Controller;

import com.alibaba.fastjson.JSON;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.lilong.damain.Student;
import top.lilong.mapper.StudentMapper;

@RestController
public class StudentTest {
    @Resource
    private StudentMapper studentMapper;

    /**
     * 查询学生的基本信息和班课和任课教师
     * @param sid
     * @return
     */
    @GetMapping("/student")
    public String student(int sid){

       Student student= studentMapper.selectManyToOne(sid);
//        Object parse = JSON.parse(student.toString());
        return student.toString();
    }

}
