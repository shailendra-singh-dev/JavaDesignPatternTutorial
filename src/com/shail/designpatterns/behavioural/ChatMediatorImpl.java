package com.shail.designpatterns.behavioural;

import java.awt.List;
import java.util.ArrayList;

public class ChatMediatorImpl implements ChatMediator {
	
	private final ArrayList<User> mUserList =new ArrayList<User>();

	@Override
	public void addUser(User user) {
		mUserList.add(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		for (final User chatUser:mUserList) {
			if(chatUser != user){
				chatUser.sendMessage(message);
			}
		}	
	}

	@Override
	public void receiveMessage(String message, User user) {
		for (final User chatUser:mUserList) {
			if(chatUser != user){
				chatUser.receiveMessage(message);
			}
		}	
	}

}
