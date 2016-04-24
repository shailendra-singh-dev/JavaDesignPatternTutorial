package com.shail.designpatterns.behavioural.templatemethod;

public class CorporateBuildIng extends TemplateMethodHouse {

	@Override
	public void buildPillers() {
		System.out.print("\nPillers are done in CorporateBuildIng");
	}

	@Override
	public void buildWindows() {
		System.out.print("\nWindows are done in CorporateBuildIng");
	}

}
