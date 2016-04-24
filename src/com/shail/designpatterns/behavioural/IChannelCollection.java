package com.shail.designpatterns.behavioural;

import com.shail.designpatterns.behavioural.IChannelItem.CHANNEL_TYPE;

public interface IChannelCollection {

	public void addChannel(final IChannelItem channelItem);
	
	public void removeChannel(final IChannelItem channelItem); 
	
	public IChannelIterator iterator(final CHANNEL_TYPE channType);

	public interface IChannelIterator{
		
		public boolean hasNext();
		
		public IChannelItem next();
		
	}

}
