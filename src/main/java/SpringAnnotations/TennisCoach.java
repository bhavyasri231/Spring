package SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component()
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    public FortuneService fortuneService;

    public TennisCoach()
    {
        System.out.println(">> TennisCoach : inside the default constructor");
    }

    /*@Autowired
    public TennisCoach(FortuneService theFortuneService)
    {
        fortuneService = theFortuneService;
    }*/

    /*@Autowired
    public void setFortuneService(FortuneService theFortuneService)
    {
        System.out.println(">> TennisCoach : inside the setFortuneService() method");
        fortuneService=theFortuneService;
    }*/

    /*@Autowired
    public void doSomeCrazyStuff(FortuneService theFortuneService)
    {
        System.out.println(">> TennisCoach : inside the doSomeCrazyStuff() method");
        fortuneService=theFortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

   @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println("TennisCoach : inside of doMyStartupStuff()");
    }

    @PreDestroy
    public void doMyCleanupStuff()
    {
        System.out.println("TennisCoach : inside of doMyCleanupStuff()");
    }
}
