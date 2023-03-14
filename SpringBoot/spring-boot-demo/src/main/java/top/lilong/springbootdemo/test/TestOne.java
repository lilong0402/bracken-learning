package top.lilong.springbootdemo.test;

import top.lilong.springbootdemo.entity.Course;
import top.lilong.springbootdemo.util.ResponseUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestOne {
    public static void main(String[] args) {
        Course gs = new Course(1, "高数","未结课");
        Course yy = new Course(2, "大学英语","结课");
        Course ja = new Course(3, "java","结课");
        Course C = new Course(4, "C","未结课");
        ResponseUtil responseUtil = new ResponseUtil();
        responseUtil.put(gs);
        responseUtil.put(yy);
        responseUtil.put(ja);
        responseUtil.put(C);
        Map<String, List<Course>> map=new HashMap<>();
        List<Course> data = responseUtil.getData();
        List<Course> data2 = responseUtil.getData();
        List<Course> overCourse = data.stream().filter(course -> course.getStatue().equals("结课")).toList();
        List<Course> notOverCourse = data2.stream().filter(course -> course.getStatue().equals("未结课")).toList();
//        System.out.println(overCourse);
//        System.out.println(notOverCourse);
        map.put("结课",overCourse);
        map.put("未结课",notOverCourse);

        String s = responseUtil.toJsonString(map);
        System.out.println(s);
//        responseUtil
    }
}
