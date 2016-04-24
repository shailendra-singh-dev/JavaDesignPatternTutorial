package com.shail.designpatterns.behavioural;

import javax.swing.text.html.MinimalHTMLWriter;

public class BinaryStringExpression implements IInterpreterExpression {

	private final int mInteger ;
	
	public BinaryStringExpression(final int i){
		mInteger =i;
	}
	
	@Override
	public String interprete(InterpreterContext interpreterContext) {
		final String str=interpreterContext.getIntToBinary(mInteger);
		System.out.print("\n BinaryStringExpression interprete "+mInteger+" to Binary "+str);
		return str;
	}

}
