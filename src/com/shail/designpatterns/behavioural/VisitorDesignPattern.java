package com.shail.designpatterns.behavioural;

public class VisitorDesignPattern {
	
	public static void testVisitorDesignPattern(){
		BookShoppingItem bookShoppingItem =new BookShoppingItem();
		KitchenShoppingItem kitchenShoppingItem=new KitchenShoppingItem();
		
		ShoppingCartVisitorImpl shoppingCartVisitorImpl=new ShoppingCartVisitorImpl();
		int totalAmount =bookShoppingItem.accept(shoppingCartVisitorImpl)+
						 kitchenShoppingItem.accept(shoppingCartVisitorImpl);
		System.out.print("\n Total Amount paid:"+totalAmount);
	}

}
