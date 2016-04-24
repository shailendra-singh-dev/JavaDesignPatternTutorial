package com.shail.designpatterns.behavioural;

import java.util.Random;

public class BookShoppingItem implements IShoppingCartItem {

	@Override
	public int getShoppingPrice() {
		return (int)Math.random()+1000;
	}

	@Override
	public int accept(IShoppingCartVisitor shopppingCartVisitor) {
		return shopppingCartVisitor.book(this);
	}

	@Override
	public String getISBN() {
		final double random =Math.random();
		return "ISBN:"+random;
	}

	@Override
	public String toString() {
		return "[ Code:"+getISBN()+",Price:"+getShoppingPrice()+"]";
	}
	
}
