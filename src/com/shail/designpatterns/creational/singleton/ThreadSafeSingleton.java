package com.shail.designpatterns.creational.singleton;

public class ThreadSafeSingleton {
 
	private static  ThreadSafeSingleton threadSafeSingleton;
	
	
	public synchronized static ThreadSafeSingleton getThreadSafeSingletonInstance(){
		if(null == threadSafeSingleton){
			threadSafeSingleton =new ThreadSafeSingleton();
		}
		return threadSafeSingleton;
	}
	
}
