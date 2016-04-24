package com.shail.designpatterns.behavioural;

public class Dollar20DispenseChain implements DispenseChain {

	private DispenseChain mDispenseChain;

	@Override
	public void setNextDispenseChain(DispenseChain chain) {
		mDispenseChain = chain;
	}

	@Override
	public void dispenseCurrency(Currency currency) {
		if (currency.getAmount()  > 20) {
			final int num = currency.getAmount() / 20;
			final int rem = currency.getAmount() % 20;		
			System.out.print("\n Dispensing "+num+" notes of 20$");
			if(0 < rem){
				if(null != mDispenseChain ){
					mDispenseChain.dispenseCurrency(new Currency(rem));	
				}
			}
		} else {
			if(null != mDispenseChain){
				mDispenseChain.dispenseCurrency(currency);	
			}
		}
	}

}
