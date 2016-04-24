package com.shail.designpatterns.structural.decorator;

public class CarDecorator implements Car {

	protected final Car mCar;

	public CarDecorator(final Car car) {
		mCar = car;
	}

	@Override
	public void assembleCar() {
		mCar.assembleCar();
	}

}
