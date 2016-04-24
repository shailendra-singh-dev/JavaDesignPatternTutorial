package com.shail.designpatterns.structural.flyweight;

public interface IShape {

	public enum SHAPE{
		RECTANGLE("rectangle"),POLYGON("polygon"),NONE("none");
		
		private String mShapeName;

		SHAPE(final String shapeName){
			mShapeName=shapeName;
		}
		
		public String getShapeName(){
			return mShapeName;
		}
	}
	
	public abstract void draw(final int x, final int y, final int width,
			final int height,final String color);
}
