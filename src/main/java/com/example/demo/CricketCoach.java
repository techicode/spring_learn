package com.example.demo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
