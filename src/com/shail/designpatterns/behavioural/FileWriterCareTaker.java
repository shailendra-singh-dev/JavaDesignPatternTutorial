package com.shail.designpatterns.behavioural;

public class FileWriterCareTaker {
	
	private Object mSaveObject;

	public void save(final FileWriterOriginator fileWriterOriginator){
		mSaveObject  = fileWriterOriginator.save();
	}

	public void undoSavedData(final FileWriterOriginator fileWriterOriginator){
		fileWriterOriginator.undoSavedData(mSaveObject);
	}
	
	@Override
	public String toString() {
		return mSaveObject.toString();
	}
}
