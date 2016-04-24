package com.shail.designpatterns.behavioural;

public class MomentoDesignPattern {
	
	public static void testMomentoDesignPattern(){
		StringBuffer fileData=new StringBuffer();
		final String firstData ="\n First set of Data is saved..";

		FileWriterCareTaker fileWriterCareTaker=new FileWriterCareTaker();
		
		FileWriterOriginator fileWriterOriginator =new FileWriterOriginator("file_name.txt", fileData);
		fileWriterOriginator.writeData(firstData);
		
		fileWriterCareTaker.save(fileWriterOriginator);
		
		System.out.print("\n "+fileWriterCareTaker);
		
		final String secondData ="\n Second set of Data is saved..";
		fileWriterOriginator.writeData(secondData);
		
		fileWriterCareTaker.save(fileWriterOriginator);
		
		System.out.print("\n "+fileWriterCareTaker);
		
		fileWriterCareTaker.undoSavedData(fileWriterOriginator);
		
		System.out.print("\n "+fileWriterCareTaker);
		
	}

}
