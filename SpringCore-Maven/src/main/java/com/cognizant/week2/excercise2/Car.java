package com.cognizant.week2.excercise2;


public class Car {
	private Engine engine;
	public Car(Engine engine)
	{
		this.engine = engine;
		System.out.println("Car Bean is created");
	}
	public void start()
	{
		System.out.println("Car is running");
	
	engine.start();
	}

}
