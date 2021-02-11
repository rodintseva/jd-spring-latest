package com.cybertek.services;

import com.cybertek.interfaces.Course;


public class Java implements Course {


    public void getTeachingHours() {

        System.out.println("Weekly teaching hours: 15" );
    }


    public  void  myInitMethod(){
        System.out.println("Executing Init Method");
    }

    public  void  myDestroyMethod(){
        System.out.println("Executing Destroy Method");
    }

}

