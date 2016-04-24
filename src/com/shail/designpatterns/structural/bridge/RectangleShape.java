package com.shail.designpatterns.structural.bridge;

public class RectangleShape extends Shape {

	public RectangleShape(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.print("Rectangle is drawn using Color"+mColor);
	    mColor.applyColor();
	}

}
