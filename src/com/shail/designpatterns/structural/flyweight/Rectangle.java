package com.shail.designpatterns.structural.flyweight;

public class Rectangle implements IShape {

	Rectangle(){
		System.out.print("\nAdding Rectangle ...");
	}

	@Override
	public void draw(int x, int y, int width, int height, String color) {
		System.out.print("\nDrawing Rectangle at x:"+x+",y:"+y);
	}

}
