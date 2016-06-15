package com.xigeng.waterfactory.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xigeng.waterfactory.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		System.out.println("Start:");
		ctx = new ClassPathXmlApplicationContext("com/xigeng/waterfactory/service/client.xml");
		IStudentService accountService = (IStudentService) ctx.getBean("studentservice");
		List<Student> studentList = accountService.selectAllStudent();
        System.out.println(studentList);
		System.out.println("End:");
	}
}
