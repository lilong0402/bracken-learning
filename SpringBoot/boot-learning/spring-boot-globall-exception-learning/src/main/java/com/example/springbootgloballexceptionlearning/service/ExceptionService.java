package com.example.springbootgloballexceptionlearning.service;

import com.example.springbootgloballexceptionlearning.consts.MsgConsts;
import com.example.springbootgloballexceptionlearning.enums.CustomExceptionType;
import com.example.springbootgloballexceptionlearning.exception.CustomException;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/28 14:17
 * @注释
 */
@Service
public class ExceptionService {
//        Class.forName("");
    public void systemBizError(){
        try {
            Class.forName("com.example.springbootgloballexceptionlearning.domain");
        } catch (ClassNotFoundException e) {
            throw new CustomException(CustomExceptionType.SYSTEM_ERROR,"在业务中，myBiz（）方法内，出现ClassNotFoundException，请将该信息告知管理员");
        }
    }
    public void userBizError(int input){
        if (input<=0){
            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, MsgConsts.INPUT_ERROR);
        }
    }

}
