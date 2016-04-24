package com.shail.designpatterns.structural.flyweight;

import com.shail.designpatterns.structural.flyweight.IShape.SHAPE;


public class FlyWeightDesignPattern {
	
  public static void testFlyWeightPatternTest(){
		ShapeFactory shapeFactory=ShapeFactory.getShapeFactoryInstance();
		shapeFactory.addShape(SHAPE.RECTANGLE);
		shapeFactory.addShape(SHAPE.POLYGON);
		
		int x=100;
		int y=100;
		int width=100;
		int height=100;
		String color ="Red";
		int randomNo=0;
		for (final IShape shape:shapeFactory.getAllShapes()) {
			randomNo =(int) Math.random();
			shape.draw(x+randomNo, y-randomNo, width*randomNo, height*randomNo, color);
		}
		
		shapeFactory.removeShape(SHAPE.RECTANGLE);
		for (final IShape shape:shapeFactory.getAllShapes()) {
			randomNo =(int) Math.random();
			shape.draw(x+randomNo, y-randomNo, width*randomNo, height*randomNo, color);
		}
		
	}

}

