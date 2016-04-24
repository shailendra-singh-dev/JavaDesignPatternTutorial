package com.shail.designpatterns.behavioural;

public class StrategyDesignPatternTest {

	public static void testStrategyDesignPattern(){
		final ShoppingItem item1=new ShoppingItem("Item1", 10000);
		final ShoppingItem item2=new ShoppingItem("Item2", 20000);
		final ShoppingItem item3=new ShoppingItem("Item3", 30000);
		final ShoppingItem item4=new ShoppingItem("Item4", 40000);
		final ShoppingItem item5=new ShoppingItem("Item5", 50000);
		
		final ShoppingCart shoppingCart=new ShoppingCart();
		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);
		shoppingCart.addItem(item3);
		shoppingCart.addItem(item4);
		shoppingCart.addItem(item5);
		
		CreditCardPaymentStrategy creditCardPaymentStrategy=new CreditCardPaymentStrategy("Temp",80909099, "33");
		shoppingCart.doPayment(creditCardPaymentStrategy);
		
		InternetBankingPaymentStrategy internetBankingPaymentStrategy=new InternetBankingPaymentStrategy("Temp", "3333");
		shoppingCart.doPayment(internetBankingPaymentStrategy);
	}
}
