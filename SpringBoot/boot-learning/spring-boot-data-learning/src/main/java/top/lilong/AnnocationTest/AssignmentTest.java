package top.lilong.AnnocationTest;

import java.lang.reflect.Field;

public class AssignmentTest {
    public static void main(String[] args) throws IllegalAccessException {
        AssignmentEntity assignmentEntity = new AssignmentEntity();
        assignmentAnnocation(assignmentEntity);
        System.out.println("a="+assignmentEntity.getA() + " b="+assignmentEntity.getB()+ " c=" +assignmentEntity.getC());
        System.out.println(assignmentEntity.sum());
    }
    static void assignmentAnnocation(AssignmentEntity assignmentEntity) throws IllegalAccessException {

        Class aClass = assignmentEntity.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field :
                declaredFields) {
            /**
             * 判断是否存在Assignment注解
             */
            if (field.isAnnotationPresent(Assignment.class)){
                /**
                 * 获取Assignment注解
                 */
                Assignment annotation = field.getAnnotation(Assignment.class);
                field.setAccessible(true);
//                System.out.println(annotation.value());
                field.set(assignmentEntity,annotation.value());
//                field.set(a);
            }
        }
    }
}
