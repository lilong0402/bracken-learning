package top.lilong.spring.ioc.entity;

public class Pen {
    private String name;

    public Pen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public Pen() {
    }
}
