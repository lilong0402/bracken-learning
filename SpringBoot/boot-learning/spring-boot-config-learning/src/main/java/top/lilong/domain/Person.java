package top.lilong.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {
    private Integer id;
    private String name;
    private List<String> hobby;
    private  String[] family;
    private Map map;
    private Pet pet;

//    @Email
//    private String email;
}
