package top.lilong.reflectPackage;

import top.lilong.AnnocationTest.User;

import java.lang.reflect.Constructor;

public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /**
         * 获取Class字节码对象
         */
        Class aClass = Class.forName("top.lilong.reflectPackage.User");
        /**
         * 获取所有公共的构造方法
         */
        Constructor[] constructors = aClass.getConstructors();
        for (Constructor con:
             constructors) {
            System.out.println(con);
        }

        /**
         * 获取所有类型的构造方法
         */
        Constructor[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor con:
                declaredConstructors) {
            System.out.println(con);
        }
//        System.out.println(user.toString());
    }
}
