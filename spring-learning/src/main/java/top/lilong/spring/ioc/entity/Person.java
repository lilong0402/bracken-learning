package top.lilong.spring.ioc.entity;

public class Person {
    private String name;
    private Clothes clothes;

    public Person() {
    }

    public Person(String name, Clothes clothes) {
        this.name = name;
        this.clothes = clothes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
    public String dress(){
        return name+"爱穿"+clothes.toString();
    }
}
