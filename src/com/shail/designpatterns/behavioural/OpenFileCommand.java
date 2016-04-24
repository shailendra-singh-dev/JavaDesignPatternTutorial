package com.shail.designpatterns.behavioural;

public class OpenFileCommand implements ICommand {

	
	private IFileSystemReceiver mIFileSystemReceiver;

	OpenFileCommand(final IFileSystemReceiver fileSystemReceiver){
		mIFileSystemReceiver = fileSystemReceiver;
	}
	
	
	@Override
	public void execute() {
		mIFileSystemReceiver.openFile();
		System.out.print("\n Open File command is executed.");
	}

}
