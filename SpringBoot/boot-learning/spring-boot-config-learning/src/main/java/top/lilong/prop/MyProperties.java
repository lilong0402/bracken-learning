package top.lilong.prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data

//标注为配置类
@Configuration

//指定自定义配置文件的位置和名称
@PropertySource("classpath:my.properties")

@ConfigurationProperties(prefix = "my")

public class MyProperties {
    private String url;
    private String username;
    private String password;
}
