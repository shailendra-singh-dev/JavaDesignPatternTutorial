package com.shail.designpatterns.behavioural;

public class CreditCardPaymentStrategy implements IPaymentStrategy {

	private final String mName;
	private final int mNumber;
	private final String mCVV;

	public CreditCardPaymentStrategy(final String name, final int number,
			final String cvv) {
		mName = name;
		mNumber = number;
		mCVV = cvv;
	}

	@Override
	public void doPayment(final ShoppingItem item) {
		System.out
				.print("\n Payment is done using CreditCardPaymentStrategy Details"
						+ "Name:"
						+ mName
						+ ",Number"
						+ mNumber
						+ ",CVV"
						+ mCVV
						+ "," + ",Item:" + item);

	}
}
