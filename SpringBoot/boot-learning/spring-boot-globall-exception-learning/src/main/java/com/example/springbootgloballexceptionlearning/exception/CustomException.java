package com.example.springbootgloballexceptionlearning.exception;

import com.example.springbootgloballexceptionlearning.enums.CustomExceptionType;
import lombok.Getter;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/28 14:17
 * @注释
 */
@Getter
public class CustomException extends RuntimeException{
    private int code;
    private String message;
    private CustomException(){}

    public CustomException(CustomExceptionType customExceptionType,String message){
        this.code= customExceptionType.getCode();
        this.message=message;
    }

}
