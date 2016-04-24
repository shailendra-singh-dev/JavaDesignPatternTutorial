package com.shail.designpatterns.behavioural;

import java.util.ArrayList;

public class ShoppingCartVisitorImpl implements IShoppingCartVisitor {

	@Override
	public int book(IShoppingCartItem shoppingCartItem) {
		if(shoppingCartItem instanceof BookShoppingItem){
			final int amount=shoppingCartItem.getShoppingPrice()*1000;
			System.out.print("\n Booking is done for 1000 books ,Item:"+shoppingCartItem+",Amount:"+amount);
			return amount;
		}else if(shoppingCartItem instanceof KitchenShoppingItem){
			final int amount=shoppingCartItem.getShoppingPrice()*2000;
			System.out.print("\n Booking is done for 2000 kitchen items ,Item:"+shoppingCartItem+",Amount:"+amount);
			return amount;
		}
		return 0;
	}

}
