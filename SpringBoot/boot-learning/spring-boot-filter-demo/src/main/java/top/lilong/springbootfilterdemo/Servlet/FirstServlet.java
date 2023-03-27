package top.lilong.springbootfilterdemo.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/27 15:18
 * @注释
 */
@WebServlet("/firstServlet")
@Slf4j
public class FirstServlet extends HttpServlet {
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  log.info("------ servlet操作");
 }
}
