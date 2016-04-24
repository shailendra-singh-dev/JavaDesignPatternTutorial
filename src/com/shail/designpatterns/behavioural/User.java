package com.shail.designpatterns.behavioural;

public abstract class User {

	protected final ChatMediator mChatMediator;
	
	protected String mName;

	public User(final ChatMediator chatMediator,final String name) {
		mChatMediator = chatMediator;
		mName=name;
	}
	
	public abstract void sendMessage(String message);
	
	public abstract void receiveMessage(String message);
	
}
