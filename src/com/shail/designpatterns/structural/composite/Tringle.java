package com.shail.designpatterns.structural.composite;

import com.shail.designpatterns.structural.flyweight.IShape;

public class Tringle implements IShape {
	

	@Override
	public void draw(int x, int y, int width, int height, String color) {
		System.out.print("\nDrawing Tringle ...");
	}

}
