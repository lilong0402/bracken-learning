package top.lilong.springbootfilterdemo.filterPackage;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/27 15:13
 * @注释
 */
//@WebFilter(urlPatterns = "/*")
@Slf4j
public class firstFilter implements Filter {
 @Override
 public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
  log.info("------ 拦截之前操作");
  filterChain.doFilter(servletRequest,servletResponse);
  log.info("------ 拦截之后操作");

 }

 @Override
 public void init(FilterConfig filterConfig) throws ServletException {

  log.info("------ 初始化拦截器");


 }

 @Override
 public void destroy() {
  log.info("------ 拦截器销毁");
 }
}
