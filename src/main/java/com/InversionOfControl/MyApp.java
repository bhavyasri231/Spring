package com.InversionOfControl;

public class MyApp {

    public static void main(String[] args) {
       Coach coach = new BasketBallCoach();
       System.out.println(coach.getDailyWorkOut());
    }
}
