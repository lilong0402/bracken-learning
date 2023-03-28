package com.example.springbootgloballexceptionlearning.enums;

import com.example.springbootgloballexceptionlearning.consts.MsgConsts;
import lombok.Getter;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/28 14:23
 * @注释
 */
@Getter
public enum CustomExceptionType {
    USER_INPUT_ERROR(400, MsgConsts.INPUT_ERROR),
    SYSTEM_ERROR(500,MsgConsts.SYSYEM_ERROR),
    OTHER_ERROR(999,MsgConsts.OTHER_ERROR);

     CustomExceptionType(int code,String desc){
        this.code=code;
        this.desc=desc;
    }
    private final int code;
     private final String desc;
}
