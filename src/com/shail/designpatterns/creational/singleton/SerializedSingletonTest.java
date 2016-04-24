package com.shail.designpatterns.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {

	public static boolean isSameReference() {
		SerializedSingleton serializedSingleton = SerializedSingleton
				.getsSerializedSingletonInstance();
		ObjectOutputStream objectOutputStream = null;
		File file=new File("./shail.txt");
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
			objectOutputStream.writeObject(serializedSingleton);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				objectOutputStream.close();
				objectOutputStream = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.print("\n Ref Object before Serialization:"+serializedSingleton);
		// Reading same object..
		ObjectInputStream objectInputStream = null;
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		SerializedSingleton deSerializedSingleton = null;
		try {
			deSerializedSingleton = (SerializedSingleton) objectInputStream
					.readObject();
			deSerializedSingleton.readResolve();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				objectInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.print("\n Ref Object After Serialization:"+deSerializedSingleton);
		
		if (deSerializedSingleton == serializedSingleton) {
			return true;
		}
		return false;
	}

}
