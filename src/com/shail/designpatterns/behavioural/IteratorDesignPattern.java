package com.shail.designpatterns.behavioural;

import com.shail.designpatterns.behavioural.IChannelItem.CHANNEL_TYPE;

public class IteratorDesignPattern {
	
	public static void testIteratorDesignPattern(){
		final ChannelCollectionImpl channelCollectionImpl=new ChannelCollectionImpl();
		IChannelItem channelItem1 =new ChannelItem(100, CHANNEL_TYPE.HINDI);
		IChannelItem channelItem2 =new ChannelItem(122, CHANNEL_TYPE.ENGLISH);
		IChannelItem channelItem3 =new ChannelItem(100, CHANNEL_TYPE.HINDI);
		IChannelItem channelItem4 =new ChannelItem(130, CHANNEL_TYPE.GUJARATI);
		IChannelItem channelItem5 =new ChannelItem(100, CHANNEL_TYPE.HINDI);
		IChannelItem channelItem6 =new ChannelItem(144, CHANNEL_TYPE.TAMIL);
		IChannelItem channelItem7 =new ChannelItem(100, CHANNEL_TYPE.HINDI);
		IChannelItem channelItem8 =new ChannelItem(100, CHANNEL_TYPE.TELGU);
		IChannelItem channelItem9 =new ChannelItem(100, CHANNEL_TYPE.HINDI);
		channelCollectionImpl.addChannel(channelItem1);
		channelCollectionImpl.addChannel(channelItem2);
		channelCollectionImpl.addChannel(channelItem3);
		channelCollectionImpl.addChannel(channelItem4);
		channelCollectionImpl.addChannel(channelItem5);
		channelCollectionImpl.addChannel(channelItem6);
		channelCollectionImpl.addChannel(channelItem7);
		channelCollectionImpl.addChannel(channelItem8);
		channelCollectionImpl.addChannel(channelItem9);
		
		final ChannelIteratorImpl channelIteratorImpl = (ChannelIteratorImpl) channelCollectionImpl.iterator(CHANNEL_TYPE.HINDI);
		while(channelIteratorImpl.hasNext()){
			System.out.print("\n Item:"+channelIteratorImpl.next());
		}
		
	}

}
