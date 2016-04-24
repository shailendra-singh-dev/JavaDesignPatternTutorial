package com.shail.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class ReflectionSingletonTest {
	
	public static boolean isSameReference(){
		BillPughSingleton billPughSingleton1 =BillPughSingleton.getBillPughSingletonInsatnce();
		BillPughSingleton billPughSingleton2=null;
		
		Constructor[] constructors=  BillPughSingleton.class.getDeclaredConstructors();
		
		for (Constructor<BillPughSingleton> constructor : constructors) {
			try {
				constructor.setAccessible(true);
				billPughSingleton2 =constructor.newInstance();
				break;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
        System.out.print("\nbillPughSingleton1:"+billPughSingleton1+",\nbillPughSingleton2:"+billPughSingleton2+"\n");		
		return  billPughSingleton1 == billPughSingleton2;
	}

}

