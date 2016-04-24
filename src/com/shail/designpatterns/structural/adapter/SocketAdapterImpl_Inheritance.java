package com.shail.designpatterns.structural.adapter;

public class SocketAdapterImpl_Inheritance extends Socket implements SocketAdater {

	@Override
	public Volt get3Volt() {
		return new Volt(convertVolt(get120Volt(), 40));
	}

	@Override
	public Volt get40Volt() {
		return new Volt(convertVolt(get120Volt(), 3));
	}

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	private int convertVolt(final Volt volt, final int factor) {
		return volt.getVolt() / factor;
	}

}
