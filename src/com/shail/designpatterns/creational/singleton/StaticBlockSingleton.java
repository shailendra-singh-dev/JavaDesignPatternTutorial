package com.shail.designpatterns.creational.singleton;

public class StaticBlockSingleton {
 
	
	private static StaticBlockSingleton instance =null;  
	
	
	private StaticBlockSingleton(){
	}
	
	
	public static StaticBlockSingleton getStaticBlockSingletonInstance(){
		return instance; 
	}
	static{
		try {
			if(null == instance){
				instance=new StaticBlockSingleton();
			}
		} catch (Exception e) {
			System.out.print("Error while creating object of StaticBlockSingleton");
		}
	}
}
