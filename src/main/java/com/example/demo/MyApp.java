package com.example.demo;

public class MyApp {
    public static void main(String[] args) {
        // create a object that
        Coach theCoach = new TrackCoach();
        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
