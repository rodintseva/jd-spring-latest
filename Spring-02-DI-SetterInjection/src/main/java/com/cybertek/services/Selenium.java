package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Selenium implements Course {

private ExtraSessions extraSessions;

    public ExtraSessions getExtraSessions() {
        return extraSessions;
    }

    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours:" + (20+extraSessions.getHours()));
    }
}


