package com.shail.designpatterns.behavioural;

public class CommandDesignPattern {

	public static void testCommandDesignPattern(){
		IFileSystemReceiver fileSystemReceiver = MyCommandUnderlyingFileSystem.getUnderLyingFileSystemRceiver();
		OpenFileCommand openFileCommand =new OpenFileCommand(fileSystemReceiver);
		MyInvoker myInvoker =new MyInvoker(openFileCommand);
		myInvoker.execute();
	}
}
