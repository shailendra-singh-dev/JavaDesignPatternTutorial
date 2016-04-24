package com.shail.designpatterns.behavioural;

public class StateDesignPattern {

	public static void testStateDesignPattern(){
			
		TvContext tvContext=new TvContext();
		tvContext.setTvState(new TvPowerOffState());
		tvContext.doAction();
		
		tvContext.setTvState(new TvPowerOnState());
		tvContext.doAction();
	}
}
