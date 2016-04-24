package com.shail.designpatterns.behavioural;

public interface ChatMediator {

	public void addUser(User user);

	public void sendMessage(String message, User user);
	
	public void receiveMessage(String message, User user);
}
