package com.shail.designpatterns.creational.singleton;


public class SingletonTestThreadB extends Thread {

	final private EagerSingletonClass mEagerSingletonClass;
	
	final private StaticBlockSingleton mStaticBlockSingleton;
	
	final private LazyInitializationSingleton mLazyInitializationSingleton;
	
	final private ThreadSafeSingleton mThreadSafeSingleton;

	private BillPughSingleton mBillPughSingleton;
	
	
	public SingletonTestThreadB(final EagerSingletonClass eagerSingletonClass,final StaticBlockSingleton staticBlockSingleton,final LazyInitializationSingleton lazyInitializationSingleton, final ThreadSafeSingleton threadSafeSingleton,final BillPughSingleton billPughSingleton){
		mEagerSingletonClass= eagerSingletonClass;
		mStaticBlockSingleton= staticBlockSingleton;
		mLazyInitializationSingleton = lazyInitializationSingleton;
		mThreadSafeSingleton = threadSafeSingleton;
		mBillPughSingleton =billPughSingleton;
	}
	
	@Override
	public void run() {
//		System.out.print("\nmEagerSingletonClass inside ThreadA:"+mEagerSingletonClass);
//		System.out.print("\nmStaticBlockSingleton inside ThreadA:"+mStaticBlockSingleton);
//		System.out.print("\nmLazyInitializationSingleton inside ThreadA:"+mLazyInitializationSingleton);
//		System.out.print("\nmThreadSafeSingleton inside ThreadA:"+mThreadSafeSingleton);
		System.out.print("\nmBillPughSingleton inside ThreadA:"+mBillPughSingleton);
	}
}
