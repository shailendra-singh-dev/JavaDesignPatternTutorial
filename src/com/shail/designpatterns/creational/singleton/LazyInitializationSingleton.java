package com.shail.designpatterns.creational.singleton;

public class LazyInitializationSingleton {

	private static  LazyInitializationSingleton eagerSingletonClass;

	private LazyInitializationSingleton() {
	}

	public static LazyInitializationSingleton getEagerSingletonClassInstance() {
		if(null == eagerSingletonClass){
			eagerSingletonClass = new LazyInitializationSingleton();
		}
		return eagerSingletonClass;
	}

}

