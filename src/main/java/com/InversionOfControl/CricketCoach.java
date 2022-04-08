package com.InversionOfControl;

public class CricketCoach implements Coach{

    private  FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach()
    {

    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress=emailAddress;
    }

    public void setTeam(String team)
    {
        this.team=team;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getTeam()
    {
        return team;
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
