package com.shail.designpatterns.behavioural;

public interface IChannelItem {

	public int getFrequency();
	
	public CHANNEL_TYPE getChannelType();
	
	public enum CHANNEL_TYPE{
		HINDI,ENGLISH,TAMIL,TELGU,GUJARATI
	}
}
