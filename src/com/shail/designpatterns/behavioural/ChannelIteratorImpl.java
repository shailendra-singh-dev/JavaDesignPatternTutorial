package com.shail.designpatterns.behavioural;

import java.util.ArrayList;

import com.shail.designpatterns.behavioural.IChannelCollection.IChannelIterator;
import com.shail.designpatterns.behavioural.IChannelItem.CHANNEL_TYPE;

public class ChannelIteratorImpl implements IChannelIterator {

	private final ArrayList<IChannelItem> mChannelItems;
	
	private final CHANNEL_TYPE mChannelType;

	private int mChannelIndex;
	
	public ChannelIteratorImpl(ArrayList<IChannelItem> channelitems, CHANNEL_TYPE channelType) {
		mChannelItems=channelitems;
		mChannelType =channelType;
	}

	@Override
	public boolean hasNext() {
		for (final IChannelItem channelItem:mChannelItems) {
			if(channelItem.getChannelType() == mChannelType){
				return true;
			}else{
				mChannelIndex++;
			}
		}
		return false;
	}

	@Override
	public IChannelItem next() {
		mChannelIndex++;
		if(mChannelIndex < mChannelItems.size()){
			return mChannelItems.get(mChannelIndex);	
		}
		return null;
	}

}
