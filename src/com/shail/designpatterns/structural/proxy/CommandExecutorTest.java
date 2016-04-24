package com.shail.designpatterns.structural.proxy;

import com.shail.designpatterns.exceptions.DesignPatternsException;
import com.shail.designpatterns.structural.proxy.ICommandExecutor.COMMAND;

public class CommandExecutorTest {

	public static void testProxyPattern(){
		ICommandExecutor commandExecutorProxy =new CommandExecutorProxy("admin","temp");
		try {
			commandExecutorProxy.runCommand(COMMAND.ADD);
			commandExecutorProxy.runCommand(COMMAND.REMOVE);
			commandExecutorProxy.runCommand(COMMAND.UPDATE);
		} catch (DesignPatternsException e) {
			System.out.print(e.getMessage());
		}catch (RuntimeException e) {
			System.out.print("Runtime Exception while applying Design Patterns"+e.getMessage());
		}
	}
}
