package com.shail.designpatterns.structural.flyweight;

import java.util.Collection;
import java.util.HashMap;

import com.shail.designpatterns.structural.flyweight.IShape.SHAPE;

public final class ShapeFactory {
	
	private static final ShapeFactory mShapeFactory =new ShapeFactory();
	
	private final HashMap<SHAPE, IShape> mShapes=new HashMap<SHAPE, IShape>();

	public static IShape getShape(final SHAPE shape){
		IShape foundShape=null;
		switch (shape) {
		case RECTANGLE:
			foundShape =new Rectangle();
			break;
			
		case POLYGON:
			foundShape =new Polygon();
			break;

		default:
			break;
		}
		return foundShape;
	}
	
	private ShapeFactory(){
	}
	
	public void addShape(final SHAPE shape){
	  IShape shp =getShape(shape);
	  mShapes.put(shape, shp);
	}
	
	public void removeShape(final SHAPE shape){
		  mShapes.remove(shape);
	}
	
	
	public Collection<IShape> getAllShapes(){
		return mShapes.values();
	}
	
	
	synchronized public static ShapeFactory getShapeFactoryInstance(){
		return mShapeFactory;
	}
	
}

