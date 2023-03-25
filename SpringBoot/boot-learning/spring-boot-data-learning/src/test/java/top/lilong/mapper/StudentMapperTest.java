package top.lilong.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.lilong.damain.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    void selectManyTOne(){

        System.out.println(studentMapper.selectManyToOne(1001));
    }

    @Test
    void batchInsert(){
        List<Student> students=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
         Student student= Student.builder()
                 .studentId(3000+i)
                 .clazzId(1)
                 .studentName("测试学生" + i)
                 .hometown("南京")
                 .birthday(LocalDate.of(2003,10,10))
                         .build();
//                 .build();
         students.add(student);
        }
        System.out.println(studentMapper.batchInsert(students));
    }

    @Test
    void batchDelete(){

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(3000+i);
        }
        studentMapper.batchDelete(list);
    }

    @Test
    void batchUpdate(){
        List<Student> list=new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            Student student=Student.builder()
                    .studentId(3020+i)
                    .clazzId(1)
                    .studentName("zzz"+i)
                    .hometown("上海").build();
            list.add(student);
        }
        System.out.println(studentMapper.batchUpdate(list));
    }
    @Test
    void dynamicSelect(){
        Student student = Student.builder().hometown("州").build();
        List<Student> students = studentMapper.dynamicSelect(student);
        students.forEach(s->{
            System.out.println(s.getStudentId() + "," +s.getStudentName()+ "," +s.getHometown() + "," +s.getBirthday());
        });
    }
    @Test
    void selectManyToStudent(){
       List<Integer> studentID=  new ArrayList<>();
       studentID.add(1001);
       studentID.add(1002);
       studentID.add(1003);
       studentID.add(1004);
       studentID.add(1005);
       studentID.add(1006);
        System.out.println(studentMapper.selectManyToStudent(studentID));
    }
}