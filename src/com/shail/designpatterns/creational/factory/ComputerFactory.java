package com.shail.designpatterns.creational.factory;

import com.shail.designpatterns.creational.abstractfactory.ComputerAbstractFactory;

public final class ComputerFactory {
	
	public enum TYPE{
		DESKTOP("Desktop"),LAPTOP("Laptop"),NONE("None");
		
		private String mType;
		TYPE(final String type){
			mType =type;
		}
		public String getName(){
			return mType;
		}
	}

	public static Computer getComputer(final TYPE type, String ram, String hdd, String cpu){
		Computer computer =null;
		switch (type) {
		case DESKTOP:
			computer = new Desktop(ram, hdd, cpu);
			break;
		case LAPTOP:
			computer = new Laptop(ram, hdd, cpu);
			break;
		default:
			break;
		}
		return computer;
	}
	
	public static Computer getComputerFactory(final ComputerAbstractFactory factory){
		return  factory.createComputer();
	}
}
