package com.shail.designpatterns.structural.bridge;

public abstract class Shape {

	protected Color mColor = null;

	public Shape(final Color color) {
		mColor = color;
	}

	public abstract void applyColor();

}
