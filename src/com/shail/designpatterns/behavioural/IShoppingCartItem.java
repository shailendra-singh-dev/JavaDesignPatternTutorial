package com.shail.designpatterns.behavioural;

public interface IShoppingCartItem {

	public int getShoppingPrice();
	
	public int accept(final IShoppingCartVisitor shopppingCartInterface);
	
	public String getISBN();
}
