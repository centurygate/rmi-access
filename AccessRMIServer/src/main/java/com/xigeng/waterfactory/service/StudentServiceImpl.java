package com.xigeng.waterfactory.service;

import com.xigeng.waterfactory.dao.IStudentDao;
import com.xigeng.waterfactory.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by free on 2016/6/9.
 */
//@Service("studentService")
public class StudentServiceImpl implements  IStudentService
{
    @Autowired
    private IStudentDao studao = null;
    @Override
    public int deleteByPrimaryKey(Integer id)
    {
        return this.studao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Student record)
    {
        return this.studao.insert(record);
    }

    @Override
    public int insertSelective(Student record)
    {
        return this.studao.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(Integer id)
    {
        return this.studao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record)
    {
        return this.studao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record)
    {
        return this.studao.updateByPrimaryKey(record);
    }

    @Override
    public List<Student> selectAllStudent() {
//        System.out.println("wo bei fangwen le ");
//        List<Student> tmp = this.studao.selectAllStudent();
//        System.out.println(tmp);
        return this.studao.selectAllStudent();
    }
}
