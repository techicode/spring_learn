package com.example.demo;

public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Corre cachulo!!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
