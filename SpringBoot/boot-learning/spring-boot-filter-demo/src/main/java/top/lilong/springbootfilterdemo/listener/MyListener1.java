package top.lilong.springbootfilterdemo.listener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import lombok.extern.slf4j.Slf4j;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/27 13:59
 * @注释
 */
@Slf4j
@WebListener
public class MyListener1 implements ServletContextListener , ServletRequestListener, ServletRequestAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("------ Context创建");
//        System.out.println("------ Context创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("------ Context销毁");
//        System.out.println("------ Context销毁");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        log.info("------ servletrequest属性增加");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        log.info("------ servletrequest属性销毁");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        log.info("------ servletrequest属性替换");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

        log.info("------ servletrequest创建");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("------ servletrequest销毁");

    }
}
