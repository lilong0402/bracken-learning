package top.lilong.AnnocationTest;

import java.lang.reflect.Field;

public class SumTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {

        SumEntity sumEntity = new SumEntity(3,4);
        one(sumEntity);
    }
    static  void one(SumEntity sumEntity) throws ClassNotFoundException, IllegalAccessException {

        /**
         * 1.获取类
         */
        Class aClass = Class.forName("top.lilong.AnnocationTest.SumEntity");
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(SumAnnocation.class)){
                SumAnnocation annotation = field.getAnnotation(SumAnnocation.class);
                /**
                 * 临时接触访问修饰符权限
                 */
                field.setAccessible(true);
                /**
                 * 获取值
                 */
//                int a= (int) field.get(sumEntity.getA());
                int a = (int) field.get(sumEntity);
//                if (a== annotation.a())
                if (a>annotation.a()){
                    System.out.println(a+"大于注解中的a:"+annotation.a());
                }else {
                    System.out.println(a+"<注解中的a:"+annotation.a());
                }
            }
        }


    }
}
