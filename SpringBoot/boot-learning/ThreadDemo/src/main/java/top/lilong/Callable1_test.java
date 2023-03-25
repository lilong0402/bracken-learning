package top.lilong;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/25 8:38
 * @注释
 */
public class Callable1_test {
 public static void main(String[] args) {
  Callable_1 callable1 = new Callable_1("张三");
  String call;
  try {
    call = callable1.call();
  } catch (Exception e) {
   throw new RuntimeException(e);
  }
  System.out.println(call);
 }
}
