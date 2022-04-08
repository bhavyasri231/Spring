package com.InversionOfControl;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Run daily 5KM";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // add a init method
    public void doMyStartupStuff()
    {
        System.out.println("TrackCoach : inside method doMyStartupStuff");
    }

    //add a destroy method
    public void doMyCleanupStuffYoYo()
    {
        System.out.println("TrackCoach : inside method doMyCleanupStuffYoYo");
    }
}
