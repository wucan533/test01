package com.wucan.controller;

import com.wucan.exception.AgeErrorException;
import com.wucan.exception.GlobalErrorException;
import com.wucan.exception.NameErrorException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/some.do")
    public ModelAndView doSome(String name,Integer age) throws GlobalErrorException{
        if(!"张三".equals(name)){
            throw new NameErrorException("姓名不是张三，不能访问");
        }

        if(age==null || age>80){
            throw new AgeErrorException("年龄不能为空，或者大于80");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("rightPage");
        return mv;
    }

    @RequestMapping("/other.do")
    public ModelAndView doOrther(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","显示姓名：张三");
        return mv;
    }
}
