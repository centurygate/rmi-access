package com.xigeng.waterfactory.service;

import com.xigeng.waterfactory.model.Student;

import java.util.List;

/**
 * Created by free on 2016/6/9.
 */
public interface IStudentService
{
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    List<Student> selectAllStudent();
}
