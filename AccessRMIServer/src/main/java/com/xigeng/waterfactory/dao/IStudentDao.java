package com.xigeng.waterfactory.dao;

import com.xigeng.waterfactory.model.Student;

import java.util.List;

public interface IStudentDao
{
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    List<Student> selectAllStudent();
}
