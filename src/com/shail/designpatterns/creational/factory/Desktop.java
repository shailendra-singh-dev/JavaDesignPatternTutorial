package com.shail.designpatterns.creational.factory;

import com.shail.designpatterns.creational.factory.ComputerFactory.TYPE;


public class Desktop extends Computer {

	private String mRAM;
	private String mHDD;
	private String mCPU;

	public Desktop(final String ram,final String hdd,final String cpu){
		mRAM=ram;
		mHDD=hdd;
		mCPU=cpu;
	}
	
	@Override
	public String getRAM() {
		return mRAM;
	}

	@Override
	public String getHDD() {
		return mHDD;
	}

	@Override
	public String getCPU() {
		return mCPU;
	}

	@Override
	public TYPE getType() {
		return TYPE.DESKTOP;
	}

}
