package top.lilong.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import top.lilong.domain.User;

import java.util.List;

public interface UserDao {

    @Select("select * from users where name= #{name} and password= #{password}")
    Integer select(@Param("name") String name, @Param("password") String password);

    @Select("select * from users where name=#{name}")
    Integer selectByName(String name);

    @Select("select * from users where name=#{name}")
    User selectByName2(String name);

    @Select("select * from users")
    List<User> selectAll();

    @Insert("insert into users(name,password) value(#{name},#{password})")
    Integer insert(@Param("name") String name,@Param("password") String password);

    @Delete("delete from users where id=#{id}")
    void del(Integer id);





}
