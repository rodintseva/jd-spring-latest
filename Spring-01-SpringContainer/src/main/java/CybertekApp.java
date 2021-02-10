import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

     //   BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        //Mentor mentor= (Mentor) container.getBean("fullTimeMentor");
        Mentor mentor = container.getBean("fullTimeMentor",Mentor.class);
        mentor.createMentorAccount();
      //  Mentor mentor2= (Mentor) container.getBean("partTimeMentor");
        Mentor mentor2 =container.getBean("fullTimeMentor",Mentor.class);
        mentor2.createMentorAccount();


    }
}
