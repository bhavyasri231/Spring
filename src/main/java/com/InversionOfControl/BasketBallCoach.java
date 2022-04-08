package com.InversionOfControl;

public class BasketBallCoach implements Coach{

    private FortuneService fortuneService;

    BasketBallCoach()
    {

    }

    public BasketBallCoach(FortuneService fortuneService)
    {
        this.fortuneService=fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Try to throw the ball into the Basket";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
