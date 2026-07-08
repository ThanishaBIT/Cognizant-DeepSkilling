package com.cognizant.week2.exercise1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("week2/exercise1/beans.xml");
        Engine engine = (Engine) context.getBean("engine");

        engine.start();

    }

}