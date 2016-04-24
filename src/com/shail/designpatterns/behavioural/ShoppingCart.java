package com.shail.designpatterns.behavioural;

import java.util.ArrayList;

public class ShoppingCart {

	private static final ArrayList<ShoppingItem> mShoppingItemList=new ArrayList<ShoppingItem>();
	
	public void addItem(final ShoppingItem item){
		mShoppingItemList.add(item);
	}
	
	public void removeItem(final ShoppingItem item){
		mShoppingItemList.remove(item);
	}
	

	public void doPayment(final IPaymentStrategy paymentStrategy){
		for(final ShoppingItem item:mShoppingItemList){
			paymentStrategy.doPayment(item);	
		}
	}
	
}
