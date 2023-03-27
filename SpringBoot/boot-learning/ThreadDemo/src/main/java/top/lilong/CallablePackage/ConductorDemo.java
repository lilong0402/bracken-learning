package top.lilong.CallablePackage;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/25 17:14
 * @注释
 */
public class ConductorDemo {
 public static void main(String[] args) {
  Conductor conductor1 = new Conductor();
//  Conductor conductor2 = new Conductor("售票员B");
//  Conductor conductor3 = new Conductor("售票员C");

  new Thread(conductor1,"售票员A").start();
  new Thread(conductor1,"售票员B").start();
  new Thread(conductor1,"售票员C").start();
 }
}
