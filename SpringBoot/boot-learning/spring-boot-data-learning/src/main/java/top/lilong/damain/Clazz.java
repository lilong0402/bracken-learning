package top.lilong.damain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Clazz {
    private Integer clazzId;
    private String clazzName;
    private Integer teacherId;

    private List<Student> students;
//    private Cc c;


    @Override
    public String toString() {
        return "{" +
                "clazzId:" + clazzId +
                ", clazzName:'" + clazzName  +
                ", teacherId:" + teacherId +
                ", students:" + students +
                '}';
    }
}
