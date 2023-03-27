package top.lilong.CallablePackage;

import java.util.concurrent.Callable;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/25 16:54
 * @注释
 */
public class Student implements Callable<String> {
 private String name;

 public Student() {
 }

 public Student(String name) {
  this.name = name;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 @Override
 public String toString() {
  return "Student{" +
          "name='" + name + '\'' +
          '}';
 }

 @Override
 public String call() throws Exception {
  System.out.println("Callable被调用了");
  return name;
 }
}
