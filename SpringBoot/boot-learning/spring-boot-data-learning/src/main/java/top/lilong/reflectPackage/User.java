package top.lilong.reflectPackage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private Integer age;

    private User(String name){

    }
    protected User(Integer age){}
//
//    public User() {
//    }
//
//    public User(String name) {
//        this.name = name;
//    }
//
//    public User(Integer age) {
//        this.age = age;
//    }
//
//    public User(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }


}
