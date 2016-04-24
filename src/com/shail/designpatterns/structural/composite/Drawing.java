package com.shail.designpatterns.structural.composite;

import java.util.ArrayList;

import com.shail.designpatterns.structural.flyweight.IShape;

public class Drawing implements IShape {

	private ArrayList<IShape> mShapes=new ArrayList<IShape>();

	public void addShape(final IShape  shape){
		mShapes.add(shape);
	}
	
	public void removeShape(final IShape shape){
		mShapes.remove(shape);
	}
	
	public void clear(){
		mShapes.clear();
	}


	@Override
	public void draw(int x, int y, int width, int height, String color) {
		for(final IShape shape:mShapes){
			shape.draw(x, y, width, height, color);
		}
	}

}
