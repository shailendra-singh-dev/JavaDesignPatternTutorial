package com.shail.designpatterns.structural.composite;


public class CompositeDesignPattern {

	public static void testCompositeDesignPattern() {
		Drawing drawing = new Drawing();

		Circle circle1 = new Circle();

		Circle circle2 = new Circle();

		Tringle tringle1 = new Tringle();

		Tringle tringle2 = new Tringle();

		drawing.addShape(circle1);
		drawing.addShape(tringle1);

		int x = 10;
		int y = 20;
		int width = 190;
		int height = 100;
		String color = "Red";

		drawing.draw(x, y, width, height, color);

		drawing.removeShape(tringle1);

		drawing.addShape(circle2);

		drawing.addShape(tringle2);

		x = 10;
		y = 20;
		width = 190;
		height = 100;
		color = "Black";

		drawing.draw(x, y, width, height, color);

	}
}
