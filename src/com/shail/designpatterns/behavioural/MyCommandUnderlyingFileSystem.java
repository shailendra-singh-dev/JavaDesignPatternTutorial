package com.shail.designpatterns.behavioural;

public class MyCommandUnderlyingFileSystem {
	
	public static IFileSystemReceiver getUnderLyingFileSystemRceiver(){
		final String osName=System.getProperty("os.name");
		if(osName.contains("Window")){
			return new WindowsFileSystemReceiver();
		}else if(osName.contains("Linux")){
			return new LinuxFileSystemReceiver();
		}else{
			return null;
		}
	}
	
}

