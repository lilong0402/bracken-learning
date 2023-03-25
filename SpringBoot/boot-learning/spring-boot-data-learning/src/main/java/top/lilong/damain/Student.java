package top.lilong.damain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    private  Integer studentId;
    private  Integer clazzId;
    private String studentName;
    private String hometown;
    private LocalDate birthday;

    /**
     * 在多方中声明一方的对象
     */
    private  Clazz clazz;

    private Course course;

    private Teacher teacher;

    @Override
    public String toString() {
        return "{" +
                "studentId:" + studentId +
                ", clazzId:" + clazzId +
                ", studentName:'" + studentName  +
                ", hometown:'" + hometown  +
                ", birthday:" + birthday +
                ", clazz:" + clazz +
                ", course:" + course +
                ", teacher:" + teacher +
                "}]";
    }
}
