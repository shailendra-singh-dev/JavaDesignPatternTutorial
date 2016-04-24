package com.shail.designpatterns.structural.adapter;

public interface SocketAdater {
	public abstract Volt get3Volt();

	public abstract Volt get40Volt();

	public abstract Volt get120Volt();
}
