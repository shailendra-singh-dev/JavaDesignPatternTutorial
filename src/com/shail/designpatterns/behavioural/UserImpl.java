package com.shail.designpatterns.behavioural;

public class UserImpl extends User{

	public UserImpl(final ChatMediator chatMediator,final String name) {
		super(chatMediator,name);
	}

	@Override
	public void sendMessage(String message) {
		System.out.print(mName+"is sending message"+message);
		mChatMediator.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.print(mName+"is receving message"+message);
		mChatMediator.receiveMessage(message, this);
	}

}
