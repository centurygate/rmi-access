package com.xigeng.waterfactory.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by free on 2016/6/13.
 */
public class AccessRMIServer {
    public  static  void main(String[] args) throws InterruptedException {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("com/xigeng/waterfactory/mapping/spring-mybatis.xml");
        Object lock = new Object();
        synchronized (lock)
        {
            lock.wait();
        }
    }
}
