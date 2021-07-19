package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {

        // load spring configuration files
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean to
        System.out.println(theCoach.getDailyWorkout());

        // call method for fortune
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
