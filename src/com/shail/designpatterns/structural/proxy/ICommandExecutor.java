package com.shail.designpatterns.structural.proxy;

public interface ICommandExecutor {

  abstract public void runCommand(final COMMAND command);

  public static final String COMMAND_ADD = "add";
  public static final String COMMAND_REMOVE = "remove";
  public static final String COMMAND_UPDATE = "update";
  public static final String COMMAND_COPY = "copy";
  public static final String COMMAND_MOVE = "move";

  public static final String OWNER_ROOT = "root";
  public static final String OWNER_ALL = "all";

  enum COMMAND {
    ADD(COMMAND_ADD, OWNER_ALL), REMOVE(COMMAND_REMOVE, OWNER_ROOT), UPDATE(COMMAND_UPDATE,
        OWNER_ALL), COPY(COMMAND_COPY, OWNER_ALL), MOVE(COMMAND_MOVE, OWNER_ROOT);

    final String mCommandName;
    final String mCommandOwner;

    COMMAND(final String commandName, final String commandOwner) {
      mCommandName = commandName;
      mCommandOwner = commandOwner;
    }

    public String getCommandName() {
      return mCommandName;
    }

    public String getCommandOwner() {
      return mCommandOwner;
    }

    public String getOwner(final COMMAND requestedcommand) {
      COMMAND[] commands = COMMAND.values();
      for (COMMAND command : commands) {
        if (command == requestedcommand) {
          return command.getCommandOwner();
        }
      }
      return null;
    }

    public boolean isRootAccessAllowed(final COMMAND requestedcommand) {
      if (getOwner(requestedcommand).equalsIgnoreCase(OWNER_ROOT)) {
        return true;
      }
      return false;
    }
  }



}
