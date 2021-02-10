package services;

import interfaces.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createMentorAccount() {
        System.out.println("Full time mentor account is created ");
    }
}
