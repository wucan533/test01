package com.wucan.service.impl;

import com.wucan.dao.StudentDao;
import com.wucan.domain.Student;
import com.wucan.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public int addStudent(Student student) {

        return studentDao.insertStudent(student);
    }

    @Override
    public List<Student> findStudent() {
        return studentDao.selectStudent();
    }

    @Override
    public int removeStudent(Integer id) {

        return studentDao.deleteStudent(id);
    }
}
