package top.lilong.spring.ioc.annotation;

import org.springframework.stereotype.Repository;
import top.lilong.spring.ioc.assemble.User;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDao...save...");
    }
}
