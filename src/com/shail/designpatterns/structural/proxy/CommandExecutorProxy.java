package com.shail.designpatterns.structural.proxy;

import com.shail.designpatterns.exceptions.DesignPatternsException;

public class CommandExecutorProxy implements ICommandExecutor {

  private boolean mIsAdmin = false;
  private CommandExecutorImpl mCommandExecutorImpl;

  public CommandExecutorProxy(final String user, final String password) {
    if (user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
      mIsAdmin = true;
      mCommandExecutorImpl = new CommandExecutorImpl();
    }
  }

  @Override
  public void runCommand(COMMAND command) throws DesignPatternsException {
    if (mIsAdmin || command.isRootAccessAllowed(command)) {
      mCommandExecutorImpl.runCommand(command);
    } else if (command == COMMAND.REMOVE || command == COMMAND.MOVE
        && (!command.isRootAccessAllowed(command))) {
      throw new DesignPatternsException(
          "Error..Command is allowed for root user only..");
    } else {
      mCommandExecutorImpl.runCommand(command);
    }
  }

}
