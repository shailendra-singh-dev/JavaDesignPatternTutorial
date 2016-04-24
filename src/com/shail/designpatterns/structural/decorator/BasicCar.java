package com.shail.designpatterns.structural.decorator;

public class BasicCar implements Car {

	@Override
	public void assembleCar() {
		System.out.print("\nBasic car is assembled..");
	}

}
