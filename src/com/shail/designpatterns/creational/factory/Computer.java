package com.shail.designpatterns.creational.factory;

import com.shail.designpatterns.creational.factory.ComputerFactory.TYPE;

public abstract class Computer {
	
	public abstract String getRAM();
	
	public abstract String getHDD();
	
	public abstract String getCPU();
	
	public abstract TYPE getType();
	
	@Override
	public String toString() {
		return "["+getType().getName()+","+getRAM()+","+getHDD()+","+getCPU()+"]";
	}
	
}
