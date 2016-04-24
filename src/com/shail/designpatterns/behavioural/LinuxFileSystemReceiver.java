package com.shail.designpatterns.behavioural;

public class LinuxFileSystemReceiver implements IFileSystemReceiver {

	@Override
	public void openFile() {
		System.out.print("\n Open File command is executed in LinuxFileSystemReceiver");
	}

	@Override
	public void readFile() {
		System.out.print("\n Read File command is executed in LinuxFileSystemReceiver");
	}

	@Override
	public void closeFile() {
		System.out.print("\n Close File command is executed in LinuxFileSystemReceiver");
	}

}
