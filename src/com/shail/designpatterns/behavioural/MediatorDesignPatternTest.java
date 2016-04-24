package com.shail.designpatterns.behavioural;

public class MediatorDesignPatternTest {

	public static void testMediatorDesignPatternTest(){
	  
        ChatMediator chatMediator=new ChatMediatorImpl();
		
        User user1=new UserImpl(chatMediator, "User1");
		User user2=new UserImpl(chatMediator, "User2");
		User user3=new UserImpl(chatMediator, "User3");
		User user4=new UserImpl(chatMediator, "User4");
		
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user4);
		
		user1.sendMessage("Hi to All.....");
		
	}
}
