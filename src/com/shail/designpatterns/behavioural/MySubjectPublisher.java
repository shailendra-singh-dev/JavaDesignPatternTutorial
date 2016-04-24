package com.shail.designpatterns.behavioural;

import java.util.ArrayList;

public class MySubjectPublisher implements ISubject {
	
	private static final ArrayList<IObserver> mObserverList =new ArrayList<IObserver>();

	private Object mUpdatedData;
	
	@Override
	public void registeObserver(IObserver observer) {
		if(!mObserverList.contains(observer)){
			mObserverList.add(observer);
		}
	}

	@Override
	public void unRegisteObserver(IObserver observer) {
		if(mObserverList.contains(observer)){
			mObserverList.remove(observer);
		}
	}

	@Override
	public void notifyObservers(Object object) {
		System.out.print("\nNotifying observers data:"+object);
		synchronized (object) {
			mUpdatedData=object;	
			for (final IObserver observer:mObserverList) {
				observer.updateData();
			}	
		}
	}

	@Override
	public Object getUpdatedObject() {
		return mUpdatedData;
	}

}
