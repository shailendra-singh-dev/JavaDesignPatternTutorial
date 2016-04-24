package com.shail.designpatterns.behavioural;

public class InterpreterContext {

	public String getIntToBinary(final int i){
		return Integer.toBinaryString(i);
	}
	
	public String getIntToHexadecimal(final int i){
		return Integer.toHexString(i);
	}
}
