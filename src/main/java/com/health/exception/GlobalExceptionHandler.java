package com.health.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName GlobalExceptionHandler 全局异常处理类
 **/
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object handlerException(Exception e){
        String message = e.getMessage();
        if(message==null || message.equals("")){
            message = "服务器错误";
        }
        Map map = new HashMap();
        map.put("message",message);
        return map;
    }
}
