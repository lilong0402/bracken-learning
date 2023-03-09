package top.lilong.ListTest;

import top.lilong.Entity.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"张三",5000.0));
        list.add(new Employee(2,"李四",5500.0));
        list.add(new Employee(3,"赵六",4000.0));

        Iterator iterator=list.iterator();
        System.out.println("员工姓名    员工薪资");
        while (iterator.hasNext()){
            Employee next = (Employee) iterator.next();
            System.out.println(next.getName()+"        "+next.getSalary());
        }
    }
}
