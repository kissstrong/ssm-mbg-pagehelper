package com.cyz.dao;

import com.cyz.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper {
    int insert(Student record);

    List<Student> selectAll();
}