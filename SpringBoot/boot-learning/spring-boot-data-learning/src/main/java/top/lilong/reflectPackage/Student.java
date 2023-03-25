package top.lilong.reflectPackage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name;
    private Integer age;
    private Character gender;

    private Double height;
    private String hobby;
}
