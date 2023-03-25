package top.lilong;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/25 8:21
 * @注释
 */
public class ThreadDemo {
 public static void main(String[] args) {
  Thread_1 thread1 = new Thread_1();

  new Thread(thread1,"售票员A").start();
  new Thread(thread1,"售票员B").start();
  new Thread(thread1,"售票员C").start();

 }
}
