package com.shail.designpatterns.structural.decorator;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void assembleCar() {
		mCar.assembleCar();
		System.out.print("\nAdding featues of Luxury Cars");
	}
	
}
