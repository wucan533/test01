package com.wucan.handler;

import com.wucan.exception.AgeErrorException;
import com.wucan.exception.NameErrorException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHd {

    @ExceptionHandler(NameErrorException.class)
    public ModelAndView doNameException(Exception ex){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","姓名必须是张三");
        mv.addObject("ex",ex);
        mv.setViewName("nameError");
        return mv;
    }
    @ExceptionHandler(AgeErrorException.class)
    public ModelAndView doAgeException(Exception ex){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","年龄不能大于80，或者为空");
        mv.addObject("ex",ex);
        mv.setViewName("ageError");
        return mv;
    }
}
