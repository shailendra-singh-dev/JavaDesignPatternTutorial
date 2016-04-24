package com.shail.designpatterns.behavioural;

public class ObserverDesignPatternTest {
	
	public static void testObserverDesignPattern(){
		MySubjectPublisher mySubjectPublisher=new MySubjectPublisher();
		
		MySubjectObserver mySubjectObserver1=new MySubjectObserver();
		MySubjectObserver mySubjectObserver2=new MySubjectObserver();
		MySubjectObserver mySubjectObserver3=new MySubjectObserver();
		
		mySubjectPublisher.registeObserver(mySubjectObserver1);
		mySubjectPublisher.registeObserver(mySubjectObserver2);
		mySubjectPublisher.registeObserver(mySubjectObserver3);
		
		mySubjectObserver1.setSubject(mySubjectPublisher);
		mySubjectObserver2.setSubject(mySubjectPublisher);
		mySubjectObserver3.setSubject(mySubjectPublisher);
		
		mySubjectPublisher.notifyObservers("Hi..");
		
	}
}
