package com.shail.designpatterns.structural.decorator;

public class SportsCar  extends CarDecorator {

	public SportsCar(final Car car){
		super(car);
	}
	
	@Override
	public void assembleCar() {
		mCar.assembleCar();
		System.out.print("\nAdding featues of SportsCar Cars");
	}
}
