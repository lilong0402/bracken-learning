package top.lilong.spring.ioc.instance.factory;

public class MyBean3Factory {
    public MyBean3Factory(){
        System.out.printf("Bean3工厂实例化中");
    }

    public Bean3 createBean(){
        return new Bean3();
    }
}
