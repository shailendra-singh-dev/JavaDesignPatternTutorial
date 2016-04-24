package com.shail.designpatterns.creational.singleton;

import java.io.IOException;
import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	private static final long serialVersionUID = 19898989889L;

	private static final SerializedSingleton sSerializedSingleton =new SerializedSingleton();
	
	private SerializedSingleton(){
	}
	
	public static SerializedSingleton getsSerializedSingletonInstance(){
		return sSerializedSingleton;
	}
	
	public Object readResolve() throws IOException{
			return getsSerializedSingletonInstance();
	}
	
	@Override
	public String toString() {
		return "["+hashCode()+"]";
	}
}
