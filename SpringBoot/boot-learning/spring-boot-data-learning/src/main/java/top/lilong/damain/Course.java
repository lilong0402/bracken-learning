package top.lilong.damain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    private Integer courseId;
    private String courseName;

    @Override
    public String toString() {
        return "{" +
                "courseId:" + courseId +
                ", courseName:'" + courseName  +
                '}';
    }

    //    private List<Student> students;
}
