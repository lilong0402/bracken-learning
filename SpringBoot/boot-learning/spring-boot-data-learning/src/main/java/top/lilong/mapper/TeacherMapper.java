package top.lilong.mapper;

import org.apache.ibatis.annotations.Select;
import top.lilong.damain.Student;
import top.lilong.damain.Teacher;

import java.util.List;

public interface TeacherMapper {
    /**
     * 一对一查询
     * @param teacherId 教师id
     * @return 教师对象
     */
    Teacher selectOneByOne(int teacherId);

    /**
     * 查询任课老师教授班级的学生
     * @param teacherId
     * @return list
     */
    @Select("SELECT * FROM t_teacher a,t_student b, t_clazz c WHERE c.clazz_id=a.clazz_id and c.clazz_id=b.clazz_id")
    List<Student> findStudentByTeacher(int teacherId);
}
