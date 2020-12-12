package com.wucan.controller;

import com.wucan.domain.Student;
import com.wucan.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Resource
    private StudentService service;

    @RequestMapping("/show.do")
    @ResponseBody
    public List<Student> showStudent(){
        List<Student> students = service.findStudent();
        return students;
    }
    @RequestMapping("/list.do")
    @ResponseBody
    public String show(){

        return "1234";
    }


    @RequestMapping("add.do")
    public ModelAndView addStu(Student student){
        int count = service.addStudent(student);
        ModelAndView mv = new ModelAndView();
        String result = "添加学生信息失败";
        if(count>0){
            result = "添加学生信息成功,该学生为："+student.getName();
        }
        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("delete.do")
    public ModelAndView deleteStudent(Integer id){
        int count = service.removeStudent(id);
        ModelAndView mv = new ModelAndView();
        String msg = "删除失败，请返回";
        if (count>0){
            msg = "删除成功";
        }
        mv.addObject("msg",msg);
        mv.setViewName("result");
        return mv;
    }
}
