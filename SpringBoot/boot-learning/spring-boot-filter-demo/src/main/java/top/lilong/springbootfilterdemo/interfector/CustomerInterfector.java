package top.lilong.springbootfilterdemo.interfector;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/27 15:57
 * @注释
 */
@Component
public class CustomerInterfector  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String authorization = request.getHeader("Authorization");
//        if (authorization!=null)
//        if ("admin".equals(authorization)){
//            return true;
//        }else {
//            response.setStatus(401);
//            return false;
//        }
//        else {
//            response.setStatus(401);
//            return false;
//        }
        return true;
    }
}
