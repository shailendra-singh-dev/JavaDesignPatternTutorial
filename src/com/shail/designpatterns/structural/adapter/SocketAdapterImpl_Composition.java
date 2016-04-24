package com.shail.designpatterns.structural.adapter;

public class SocketAdapterImpl_Composition implements SocketAdater {

	private Socket mSocket = new Socket();

	@Override
	public Volt get3Volt() {
		return new Volt(convertVolt(mSocket.getVolt(), 40));
	}

	@Override
	public Volt get40Volt() {
		return new Volt(convertVolt(mSocket.getVolt(), 3));
	}

	@Override
	public Volt get120Volt() {
		return mSocket.getVolt();
	}

	private int convertVolt(final Volt volt, final int factor) {
		return volt.getVolt() / factor;
	}

}
