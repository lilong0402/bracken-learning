package com.example.springbootgloballexceptionlearning.handler;

import com.example.springbootgloballexceptionlearning.enums.CustomExceptionType;
import com.example.springbootgloballexceptionlearning.exception.CustomException;
import com.example.springbootgloballexceptionlearning.util.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/28 14:18
 * @注释
 */
@Controller
@Slf4j
public class WebExceptionHandler {
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public AjaxResponse handleException1(CustomException e){
        if (e.getCode() == CustomExceptionType.SYSTEM_ERROR.getCode()){
            log.info(CustomExceptionType.SYSTEM_ERROR.getDesc());
        }
        return AjaxResponse.error(e);
    }
}
