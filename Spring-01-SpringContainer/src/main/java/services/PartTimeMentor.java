package services;

import interfaces.Mentor;

public class PartTimeMentor implements Mentor {

    @Override
    public void createMentor() {
        System.out.println("Part Time mentor is created");
    }
}
