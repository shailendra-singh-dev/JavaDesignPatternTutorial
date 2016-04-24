package com.shail.designpatterns.behavioural;

public class TvPowerOffState implements ITvState {

	@Override
	public void doAction() {
		System.out.print("doAction() in TvPowerOffState");
	}

}
