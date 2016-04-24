package com.shail.designpatterns.behavioural;

import java.util.ArrayList;

import com.shail.designpatterns.behavioural.IChannelItem.CHANNEL_TYPE;

public class ChannelCollectionImpl implements IChannelCollection {

	private static final ArrayList<IChannelItem> mChannelItems=new ArrayList<IChannelItem>();
	
	@Override
	public void addChannel(IChannelItem channelItem) {
		mChannelItems.add(channelItem);
	}

	@Override
	public void removeChannel(IChannelItem channelItem) {
		mChannelItems.remove(channelItem);
	}

	@Override
	public IChannelIterator iterator(CHANNEL_TYPE channelType) {
		return new ChannelIteratorImpl(mChannelItems,channelType);
	}

}
