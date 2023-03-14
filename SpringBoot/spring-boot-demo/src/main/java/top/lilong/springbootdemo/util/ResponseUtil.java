package top.lilong.springbootdemo.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import top.lilong.springbootdemo.entity.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ResponseUtil {
    private String code;
    private String message;
    private List<Course> data =new ArrayList<>();
//    private Map< List<Course>>

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Course> getData() {
        return data;
    }

    public void setData(List<Course> data) {
        this.data = data;
    }

    public ResponseUtil() {
        this.code="0";
        this.message="success";
    }

    public ResponseUtil(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseUtil put(Course course){
        this.data.add(course);
        return this;
    }
    public ResponseUtil putMap(Course course){
        this.data.add(course);
        return this;
    }
    public String toJsonString() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    public String toJsonString(Map<String,List<Course>> map){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return objectMapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
