package com.cognizant.week2.excercise2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[]args)
	{
		
	ApplicationContext context = new ClassPathXmlApplicationContext("week2/excercise2/beans.xml");
	Car car = context.getBean(Car.class);
	car.start();
	}
}
