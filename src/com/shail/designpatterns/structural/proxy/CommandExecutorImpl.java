package com.shail.designpatterns.structural.proxy;

import java.io.IOException;

import com.shail.designpatterns.exceptions.DesignPatternsException;

public class CommandExecutorImpl implements ICommandExecutor {

	@Override
	public void runCommand(COMMAND command) throws DesignPatternsException {
		try {
			Runtime.getRuntime().exec(command.getCommandName());
		} catch (IOException e) {
			e.printStackTrace();
			throw new DesignPatternsException("Error while executing command"+command.getCommandName());
		}
	}
	
}
