package top.lilong.CallablePackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/25 16:55
 * @注释
 */
public class StudentDemo {
 public static void main(String[] args) throws Exception {
     Student student = new Student("张三");
     FutureTask<String> stringFutureTask = new FutureTask<>(student);
     for (int i = 0; i < 50 ; i++){
      System.out.println(Thread.currentThread().getName()+":"+i);
      if (i==20)  new Thread(stringFutureTask, "子线程").start();
     }
  System.out.println(stringFutureTask.get());

 }
}
