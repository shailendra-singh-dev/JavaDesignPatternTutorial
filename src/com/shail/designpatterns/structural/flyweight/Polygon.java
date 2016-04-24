package com.shail.designpatterns.structural.flyweight;

public class Polygon implements IShape {

	Polygon(){
		System.out.print("\n Adding Polygon ...");
	}

	@Override
	public void draw(int x, int y, int width, int height, String color) {
		System.out.print("\nDrawing Polygon at x:"+x+",y:"+y);
	}

}
