package com.shail.designpatterns.behavioural;

import java.util.Scanner;

import com.shail.designpatterns.behavioural.DispenseChain.Currency;

public class ChainResposibilityDesignPattern {

	public static void testChainResposibilityDesignPattern(){
		
		DispenseChain chain1=new Dollar50DispenseChain();
		DispenseChain chain2=new Dollar20DispenseChain();
		DispenseChain chain3=new Dollar10DispenseChain();
		
		chain1.setNextDispenseChain(chain2);
		chain2.setNextDispenseChain(chain3);
			
		
		Scanner scanner=new Scanner(System.in);
		final int amount= scanner.nextInt();
		
		chain1.dispenseCurrency(new Currency(amount));
		
		
	}
}
