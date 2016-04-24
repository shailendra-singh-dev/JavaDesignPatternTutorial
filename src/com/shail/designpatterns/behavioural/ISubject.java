package com.shail.designpatterns.behavioural;

public interface ISubject {
	
	public void registeObserver(final IObserver observer);
	
	public void unRegisteObserver(final IObserver observer);
	
	public void notifyObservers(final Object object);
	
	public Object getUpdatedObject(); 
	
}
