package com.shail.designpatterns.behavioural;

public class InternetBankingPaymentStrategy implements IPaymentStrategy {

	private final String mUsername;
	private final String mPassword;

	public InternetBankingPaymentStrategy(final String username,
			final String password) {
		mUsername = username;
		mPassword = password;
	}

	@Override
	public void doPayment(final ShoppingItem item) {
		System.out
				.print("\nPayment is done using InternetBankingPaymentStrategy Details"
						+ ",Username:"
						+ mUsername
						+ ",mPassword"
						+ mPassword
						+ ",item:" + item);

	}
}
