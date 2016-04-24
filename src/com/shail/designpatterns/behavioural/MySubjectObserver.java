package com.shail.designpatterns.behavioural;

public class MySubjectObserver implements IObserver {

	private ISubject mISubject;
	
	@Override
	public void setSubject(ISubject subject) {
		mISubject=subject;
	}

	@Override
	public void updateData() {
		final Object object=mISubject.getUpdatedObject();
		System.out.print("\n Observer received Data:"+object);	
	}

}
