package com.shail.designpatterns.behavioural;

import com.shail.designpatterns.structural.proxy.ICommandExecutor;

public class MyInvoker implements ICommand {

	
	private ICommand mICommand;

	public MyInvoker(final ICommand command){
		mICommand =command;
	}
	
	@Override
	public void execute() {
		mICommand.execute();
		
	}


}
