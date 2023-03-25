package top.lilong.reflectPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Test02 {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Student student = new Student("aa",12,'男',55.0,"睡觉");
        Teacher teacher = new Teacher("张老师",5555.8);

        saveObject(student);
//        saveObject(teacher);

    }
    static void saveObject(Object object) throws IllegalAccessException, IOException {
        Field[] fields = object.getClass().getDeclaredFields();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\nangong\\大三\\backen-learning\\SpringBoot\\boot-learning\\spring-boot-data-learning\\src\\main\\java\\top\\lilong\\reflectPackage\\a.txt"));
        for (Field field:
             fields) {
            /**
             * 临时取消所有访问限制
             */
            field.setAccessible(true);

            bufferedWriter.write(field.getName() +"="+ field.get(object));
            bufferedWriter.newLine();
            /**
             * 获取属性名
             */
            System.out.print(field.getName()+":");
            /**
             * 获取属性值
             */
            System.out.println(field.get(object));

        }
    }
}
