package com.cyz.service.impl;

import com.cyz.dao.StudentMapper;
import com.cyz.domain.Student;
import com.cyz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
private StudentMapper studentMapper;

    @Override
    public List<Student> findall() {
        List<Student> students = studentMapper.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }
        return students;
    }

}
