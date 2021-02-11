package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Selenium implements Course {
    ExtraSessions extraSessions;
    public  Selenium(ExtraSessions extraSessions){
        this.extraSessions=extraSessions;

    }
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours:" + (20+extraSessions.getHours()));
    }
}


