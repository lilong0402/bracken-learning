package top.lilong.springbootfilterdemo.ApplicationEventPackage;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/27 18:45
 * @注释
 */
public class MyEvent extends ApplicationEvent {

 public MyEvent(Object source) {
  super(source);
 }

}
