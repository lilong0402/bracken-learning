package top.lilong.mapper;

import org.apache.ibatis.annotations.*;
import top.lilong.damain.Course;
import top.lilong.damain.Student;

import java.util.List;

public interface StudentMapper {
    Student selectManyToOne(int studentId);

    /**
     * 批量新增学生
     * @param students
     * @return int
     */
    int batchInsert(@Param("students")List<Student> students);

    int batchDelete(@Param("idList") List<Integer> idList);

    int batchUpdate(@Param("students") List<Student> students);

    List<Student> dynamicSelect (Student student);

    List<Student> selectManyToStudent(@Param("students") List<Integer> studentId);


    @Select("SELECT * FROM t_student where student_id=#{studentId}")
    Student findById(int studentId);

    @Insert("INSERT INTO t_student(clazz_id,student_name,hometown,birthday) VALUES (#{classId},#{studentName},#{hometown},#{birthday})")
    int insertStudent(Student student);
//    List<Course> selectManyToCourse()
    @Update("UPDATE t_student set clazz_id = #{clazzId},student_name=#{studentName},hometown=#{hometown},birthday=#{birthday}")
    int updateStudent(Student student);

    @Delete("DELETE FROM t_student WHERE student_id=#{studentId}")
    int deleteStudent(int studentId);
}
