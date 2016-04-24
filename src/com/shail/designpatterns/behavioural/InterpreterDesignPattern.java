package com.shail.designpatterns.behavioural;

public class InterpreterDesignPattern {
	
	public static void testInterpreterDesignPattern(){
		BinaryStringExpression binaryStringExpression=new BinaryStringExpression(100);
		HexStringExpression hexStringExpression=new HexStringExpression(20);
		
		InterpreterContextImpl interpreterContextImpl=new InterpreterContextImpl();
		interpreterContextImpl.interpreteExpression(binaryStringExpression);
		interpreterContextImpl.interpreteExpression(hexStringExpression);
	}

}
