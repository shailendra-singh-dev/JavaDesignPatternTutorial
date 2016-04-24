package com.shail.designpatterns.structural.bridge;


public class BridgeDesignPatterns {

	public static void testBridgeDesignPatter(){
			Color greenColor =new GreenColor();	
			Shape rectangle=new RectangleShape(greenColor);
			rectangle.applyColor();
			
			Color redColor =new RedColor();
			Shape circle =new CircleShape(redColor);
			circle.applyColor();
	}
}
