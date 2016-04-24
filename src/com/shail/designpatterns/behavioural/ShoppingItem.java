package com.shail.designpatterns.behavioural;

public final class ShoppingItem {

	private final String mItemName;
	private final int mAmount;
	
	public ShoppingItem( final String itemName,final int amount){
		mItemName= itemName;
		mAmount=amount;
	}

	public String getmItemName() {
		return mItemName;
	}

	public int getmAmount() {
		return mAmount;
	}

	@Override
	public String toString() {
		return "[Item:"+mItemName+",Amount"+mAmount+"]";
	}
}
