package com.cyz.dao;

import com.cyz.domain.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DeptMapper {
    int insert(Dept record);

    List<Dept> selectAll();
}