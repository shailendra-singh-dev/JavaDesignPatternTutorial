package com.shail.designpatterns.structural.bridge;

public class CircleShape extends Shape{

	public CircleShape(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.print("Rectangle is drawn using Color"+mColor);
	    mColor.applyColor();
	}
	
}
