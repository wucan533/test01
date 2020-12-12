package com.wucan.dao;

import com.wucan.domain.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student stu);

    List<Student> selectStudent();

    int deleteStudent(Integer id);
}
