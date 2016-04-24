package com.shail.designpatterns.creational.singleton;

public class BillPughSingleton {
	
	private BillPughSingleton(){
	}
	
	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE =new BillPughSingleton();
	}
	
	public static BillPughSingleton getBillPughSingletonInsatnce(){
		return SingletonHelper.INSTANCE;
	}
	
}
