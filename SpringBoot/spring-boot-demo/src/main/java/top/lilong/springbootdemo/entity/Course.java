package top.lilong.springbootdemo.entity;

public class Course {
    private Integer id;
    private String name;
    private String statue;

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", statue='" + statue + '\'' +
                '}';
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public Course(Integer id, String name, String statue) {
        this.id = id;
        this.name = name;
        this.statue = statue;
    }

    public Course(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
