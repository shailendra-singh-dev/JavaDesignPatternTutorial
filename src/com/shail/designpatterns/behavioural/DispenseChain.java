package com.shail.designpatterns.behavioural;

public interface DispenseChain {

	public void setNextDispenseChain(final DispenseChain chain);

	public void dispenseCurrency(final Currency currency);

	public static final class Currency {

		final private int mAmount;

		public Currency(final int amount) {
			mAmount = amount;
		}

		public int getAmount() {
			return mAmount;
		}
	}

}
