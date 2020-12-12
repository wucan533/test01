package com.wucan.service;

import com.wucan.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);

    List<Student> findStudent();

    int removeStudent(Integer id);


}
