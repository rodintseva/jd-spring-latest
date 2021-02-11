package com.cybertek;


import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {
        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        Course course = container.getBean("java",Course.class);
        course.getTeachingHours();
//To Close the Container
        ((ClassPathXmlApplicationContext)container).close();

    }
}
