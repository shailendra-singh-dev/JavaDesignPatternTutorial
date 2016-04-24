package com.shail.designpatterns.behavioural;

public class ChannelItem implements IChannelItem {

	private final int mFrequency;
	
	private final CHANNEL_TYPE mChannelType;

	public ChannelItem(final int frequency,final CHANNEL_TYPE channelType ){
		mFrequency=frequency;
		mChannelType =channelType;
	}
	
	public int getFrequency() {
		return mFrequency;
	}

	public CHANNEL_TYPE getChannelType() {
		return mChannelType;
	}

}
