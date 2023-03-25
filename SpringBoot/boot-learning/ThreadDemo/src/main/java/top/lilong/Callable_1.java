package top.lilong;

import java.util.concurrent.Callable;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/25 8:36
 * @注释
 */
public class Callable_1 implements Callable<String> {
  private String name;

 public Callable_1() {
 }

 @Override
 public String toString() {
  return "Callable_{" +
          "name='" + name + '\'' +
          '}';
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Callable_1(String name) {
  this.name = name;
 }

 @Override
 public String call() throws Exception {
  return "call"+name;
 }
}
