package top.lilong.CallablePackage;

import ch.qos.logback.core.joran.conditional.ThenAction;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/25 17:12
 * @注释
 */
public class Conductor implements Runnable {
// private String name;

// public Conductor(String name) {
//  this.name = name;
// }

 private  int ticket=50;
 int count=0;
 @Override
 public void run() {
     while (true) {
         synchronized (this) {
             if (ticket <= 0) break;
             ticket--;
             try {
                 Thread.sleep(100);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             System.out.println(Thread.currentThread().getName() + "售出一张还剩下：" + ticket + "张");

         }
     }
 }
}
