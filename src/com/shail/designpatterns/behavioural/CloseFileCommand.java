package com.shail.designpatterns.behavioural;

public class CloseFileCommand implements ICommand {

	
	private IFileSystemReceiver mIFileSystemReceiver;

	CloseFileCommand(final IFileSystemReceiver fileSystemReceiver){
		mIFileSystemReceiver = fileSystemReceiver;
	}
	
	
	@Override
	public void execute() {
		mIFileSystemReceiver.closeFile();
		System.out.print("\n Close File command is executed.");
	}

}
