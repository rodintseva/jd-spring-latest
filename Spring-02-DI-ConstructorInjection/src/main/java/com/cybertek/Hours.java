package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hours {

    public static void main(String[] args) {
        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        Course course = container.getBean("javaHours", Course.class);
        course.getTeachingHours();
        Course course1 = container.getBean("seleniumHours", Course.class);
        course1.getTeachingHours();




    }
}