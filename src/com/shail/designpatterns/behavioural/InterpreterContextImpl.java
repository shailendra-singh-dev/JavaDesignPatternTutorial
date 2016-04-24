package com.shail.designpatterns.behavioural;

public class InterpreterContextImpl {

	private final InterpreterContext mInterpreterContext =new InterpreterContext();
	
	public String interpreteExpression(final IInterpreterExpression interpreterExpression){
		return interpreterExpression.interprete(mInterpreterContext);
	}
}
