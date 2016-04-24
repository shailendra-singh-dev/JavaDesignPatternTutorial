package com.shail.designpatterns.behavioural;

public class FileWriterOriginator {
	
	private String mFileName;
	
	private StringBuffer mFileData;
	
	FileWriterOriginator(final String fileName,final StringBuffer fileData){
		mFileName = fileName;
		mFileData =fileData;
	}
	
	public void writeData(final String data){
		mFileData.append(data);
	}

	public FileWriterMomento save(){
		return new FileWriterMomento(mFileName, mFileData);
	}
	
	public void undoSavedData(final Object savedObject){
		final FileWriterMomento fileWriterMomento =(FileWriterMomento)savedObject;
		fileWriterMomento.setFileName(mFileName);
		fileWriterMomento.setFileData(mFileData);
	}
	
	
	private static final class FileWriterMomento{
		
		private String mFileName;
		
		private StringBuffer mFileData;
		
		FileWriterMomento(final String fileName,final StringBuffer fileData){
			mFileName = fileName;
			mFileData =fileData;
		}
		
		public String getFileName() {
			return mFileName;
		}

		public void setFileName(String mFileName) {
			this.mFileName = mFileName;
		}

		public StringBuffer getFileData() {
			return mFileData;
		}

		public void setFileData(StringBuffer mFileData) {
			this.mFileData = mFileData;
		}
		
		@Override
		public String toString() {
			return "[ Data:"+getFileData()+"]";
		}
	}
	

}
