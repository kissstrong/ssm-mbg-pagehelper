package com.cyz.controller;

import com.cyz.domain.Student;
import com.cyz.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    @ResponseBody
    @RequestMapping("/find")
    public void findStu(){
        List<Student> findall = studentService.findall();
        for (Student student : findall) {
            System.out.println(student);
        }
    }
}
