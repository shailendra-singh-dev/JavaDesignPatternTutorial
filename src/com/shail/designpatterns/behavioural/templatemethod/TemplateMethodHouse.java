package com.shail.designpatterns.behavioural.templatemethod;

public abstract class TemplateMethodHouse {

	public final void buildHouse(){
		buildFoundation();
		buildPillers();
		buildWalls();
		buildWindows();
	}
	
	private void buildFoundation(){
		System.out.print("\nFoundation is done");
	}
	
	public abstract void buildPillers();
	
	private void buildWalls(){
		System.out.print("\nWall are done");
	}
	
	public abstract void buildWindows();
	
}
