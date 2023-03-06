package top.lilong.spring.ioc.entity;

import java.util.List;

public class SchoolBag {
    private String color;
    private List<Pen> pencilCase;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Pen> getPencilCase() {
        return pencilCase;
    }

    public void setPencilCase(List<Pen> pencilCase) {
        this.pencilCase = pencilCase;
    }

    @Override
    public String toString() {
        return color+pencilCase.toString();
    }
}
