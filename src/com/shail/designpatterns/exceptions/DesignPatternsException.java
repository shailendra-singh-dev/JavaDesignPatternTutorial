package com.shail.designpatterns.exceptions;

public class DesignPatternsException extends RuntimeException {
  
  private static final long serialVersionUID = -5996066756906456567L;
  
  private String mMessage =null;
	
	public DesignPatternsException(final String exceptionName){
		super(exceptionName);
		mMessage =exceptionName;
	}
	
	@Override
	public String getMessage() {
		return mMessage;
	}
	
}
