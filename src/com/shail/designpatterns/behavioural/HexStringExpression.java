package com.shail.designpatterns.behavioural;

import javax.swing.text.html.MinimalHTMLWriter;

public class HexStringExpression implements IInterpreterExpression {

	private final int mInteger ;
	
	public HexStringExpression(final int i){
		mInteger =i;
	}
	
	@Override
	public String interprete(InterpreterContext interpreterContext) {
		final String str=interpreterContext.getIntToHexadecimal(mInteger);
		System.out.print("\n HexStringExpression interprete "+mInteger+" to Hexadecimal "+str);
		return str;
	}

}
