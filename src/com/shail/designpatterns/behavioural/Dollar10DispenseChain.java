package com.shail.designpatterns.behavioural;

public class Dollar10DispenseChain implements DispenseChain {

	private DispenseChain mDispenseChain;

	@Override
	public void setNextDispenseChain(DispenseChain chain) {
		mDispenseChain = chain;
	}

	@Override
	public void dispenseCurrency(Currency currency) {
		if (currency.getAmount()  > 10) {
			final int num = currency.getAmount() / 10;
			final int rem = currency.getAmount() % 10;		
			System.out.print("\n Dispesning "+num+" notes of 10$");
			if(10 < rem){
				if(null != mDispenseChain){
					mDispenseChain.dispenseCurrency(new Currency(rem));	
				}
			}else{
				System.out.print("\n Amount "+rem+" can't be dispensed..");
			}
		} else {
			if(null != mDispenseChain){
				mDispenseChain.dispenseCurrency(currency);		
			}
		}
	}

}
