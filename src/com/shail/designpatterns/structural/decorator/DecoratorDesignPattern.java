package com.shail.designpatterns.structural.decorator;

public class DecoratorDesignPattern {

	public static void testDecoratorDesighPattern(){
		Car sportsCar =new SportsCar(new BasicCar());
		sportsCar.assembleCar();
		
		Car luxuryCar =new LuxuryCar(new SportsCar(new BasicCar()));
		luxuryCar.assembleCar();
		
	}
}
