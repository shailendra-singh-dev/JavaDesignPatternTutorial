package com.shail.designpatterns.behavioural;

public class TvContext implements ITvState {

	
	private ITvState mTvState;

	public void setTvState(final ITvState iTvState){
		mTvState =	iTvState;
	}
	
	@Override
	public void doAction() {
		mTvState.doAction();
	}
	
	public ITvState getTvState(){
		return mTvState;
	}

}
