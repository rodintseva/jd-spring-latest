package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        Course course1 = container.getBean("java",Course.class);
        Course course2 = container.getBean("java",Course.class);
        System.out.println("Pointing to the same object:  " + (course1==course2));

        System.out.println("Memory Location for the course1 " +course1);
        System.out.println("Memory Location for the course2 " +course2);
    }
}

