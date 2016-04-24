package com.shail.designpatterns.behavioural;

public class ReadFileCommand implements ICommand {

	
	private IFileSystemReceiver mIFileSystemReceiver;

	ReadFileCommand(final IFileSystemReceiver fileSystemReceiver){
		mIFileSystemReceiver = fileSystemReceiver;
	}
	
	@Override
	public void execute() {
		mIFileSystemReceiver.readFile();
		System.out.print("\n Read File command is executed.");
	}

}
