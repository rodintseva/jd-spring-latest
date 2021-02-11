package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;


public class Java implements Course {
    public int x;

  private ExtraSessions  extraSessions;

    public ExtraSessions getExtraSessions() {
        return extraSessions;
    }

    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly teaching hours:" + (15 + extraSessions.getHours()));
    }
}

