package com.shail.designpatterns.creational.singleton;

public class EagerSingletonClass {

	private static final EagerSingletonClass eagerSingletonClass = new EagerSingletonClass();

	private EagerSingletonClass() {
	}

	public static EagerSingletonClass getEagerSingletonClassInstance() {
		return eagerSingletonClass;
	}
}
