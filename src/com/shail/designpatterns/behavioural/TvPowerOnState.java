package com.shail.designpatterns.behavioural;

public class TvPowerOnState implements ITvState {

	@Override
	public void doAction() {
		System.out.print("doAction() in TvPowerOnState");
	}

}
