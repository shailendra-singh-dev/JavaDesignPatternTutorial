package com.shail.designpatterns.behavioural;

public class WindowsFileSystemReceiver implements IFileSystemReceiver {

	@Override
	public void openFile() {
		System.out.print("\n Open File command is executed in WindowsFileSystemReceiver");

	}

	@Override
	public void readFile() {
		System.out.print("\n Read File command is executed in WindowsFileSystemReceiver");
	}

	@Override
	public void closeFile() {
		System.out.print("\n Close File command is executed in WindowsFileSystemReceiver");
	}

}
