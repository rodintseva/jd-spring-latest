package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;


public class Java implements Course {
    public int x;

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    private  OfficeHours officeHours;

      @Override
    public void getTeachingHours() {

        System.out.println("Weekly teaching hours:" + (15 + officeHours.getHours()));
    }
}

