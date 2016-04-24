package com.shail.designpatterns.creational.abstractfactory;

import com.shail.designpatterns.creational.factory.Computer;
import com.shail.designpatterns.creational.factory.Desktop;

public class DesktopFactory extends ComputerAbstractFactory {

	private String mRAM;
	private String mHDD;
	private String mCPU;
	
	public DesktopFactory (final String ram,final String hdd,final String cpu){
		mRAM=ram;
		mHDD=hdd;
		mCPU=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Desktop(mRAM, mHDD, mCPU);
	}

}
