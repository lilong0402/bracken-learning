package top.lilong.damain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {
    private Integer teacherId;
    private String teacherName;

//    private Integer clazzId;
//    private Clazz clazz;

//    public Teacher() {
//    }

//    public Teacher(Integer teacherId, String teacherName, Integer clazzId, Clazz clazz) {
//        this.teacherId = teacherId;
//        this.teacherName = teacherName;
//        this.clazzId = clazzId;
//        this.clazz = clazz;
//    }
//
//    public Integer getTeacherId() {
//        return teacherId;
//    }
//
//    public void setTeacherId(Integer teacherId) {
//        this.teacherId = teacherId;
//    }
//
//    public String getTeacherName() {
//        return teacherName;
//    }
//
//    public void setTeacherName(String teacherName) {
//        this.teacherName = teacherName;
//    }
//
//    public Integer getClazzId() {
//        return clazzId;
//    }
//
//    public void setClazzId(Integer clazzId) {
//        this.clazzId = clazzId;
//    }
//
//    public Clazz getClazz() {
//        return clazz;
//    }
//
//    public void setClazz(Clazz clazz) {
//        this.clazz = clazz;
//    }
//

    @Override
    public String toString() {
        return "{" +
                "teacherId :" + teacherId +
                ", teacherName :'" + teacherName + '\'' +
                '}';
    }
}
