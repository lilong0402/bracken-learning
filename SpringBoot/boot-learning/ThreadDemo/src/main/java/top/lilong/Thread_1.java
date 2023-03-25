package top.lilong;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/25 8:15
 * @注释
 */
public class Thread_1 implements Runnable{
 public int stick=20;

 @Override
 public void run() {
  while (true) {
    synchronized (this){
      if (stick <= 0) {
          System.out.println(Thread.currentThread().getName() + "已经售空票,剩余：" + stick + "张");
          break;
      }
      try {
          Thread.sleep(1000);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
      stick--;
      System.out.println(Thread.currentThread().getName() + "票还剩余：" + stick + "张");

    }
  }
 }
}
