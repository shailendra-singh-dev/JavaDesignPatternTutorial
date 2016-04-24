package com.shail.designpatterns.behavioural.templatemethod;

public class TemplateMethodDesignPatternTest {

	public static void testTemplateMethodDesignPatternTest(){
		TemplateMethodHouse corporateHouse=new CorporateBuildIng();
		corporateHouse.buildHouse();
		
		TemplateMethodHouse hotale=new Hotale();
		hotale.buildHouse();
		
	}
}
