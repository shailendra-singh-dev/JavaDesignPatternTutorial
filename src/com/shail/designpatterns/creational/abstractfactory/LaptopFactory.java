package com.shail.designpatterns.creational.abstractfactory;

import com.shail.designpatterns.creational.factory.Computer;
import com.shail.designpatterns.creational.factory.Desktop;
import com.shail.designpatterns.creational.factory.Laptop;

public class LaptopFactory extends ComputerAbstractFactory {

	private String mRAM;
	private String mHDD;
	private String mCPU;
	
	public LaptopFactory (final String ram,final String hdd,final String cpu){
		mRAM=ram;
		mHDD=hdd;
		mCPU=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Laptop(mRAM, mHDD, mCPU);
	}

}
