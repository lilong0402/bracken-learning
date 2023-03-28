package com.example.springbootgloballexceptionlearning.util;

import com.example.springbootgloballexceptionlearning.exception.CustomException;
import lombok.Data;

/**
 * @version 1.0
 * @Author 李龙
 * @Date 2023/3/28 14:18
 * @注释
 */
@Data
public class AjaxResponse {
    private int code;
    private String message;
    private Object data;

    public AjaxResponse() {
    }

    public static AjaxResponse error(CustomException e) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(e.getCode());
        ajaxResponse.setMessage(e.getMessage());
        return ajaxResponse;
    }
    public static AjaxResponse error(CustomException customException,String error){

        AjaxResponse resultBean=new AjaxResponse();
        resultBean.setCode(customException.getCode());
        resultBean.setMessage(error);
        return resultBean;
    }
    public static AjaxResponse success(){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        return ajaxResponse;
    }

    public static AjaxResponse success(Object obj){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
}
