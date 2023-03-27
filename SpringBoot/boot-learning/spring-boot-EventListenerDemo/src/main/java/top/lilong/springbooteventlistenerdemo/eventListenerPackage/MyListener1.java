package top.lilong.springbooteventlistenerdemo.eventListenerPackage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import top.lilong.springbooteventlistenerdemo.eventPackage.MyEvent;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/27
 * @注释
 */
@Slf4j
public class MyListener1 implements ApplicationListener<MyEvent> {
 @Override
 public void onApplicationEvent(MyEvent event) {
  log.info(String.format("%s 监听到事件源：%s.", MyListener1.class.getName(), event.getSource()));
 }
}
