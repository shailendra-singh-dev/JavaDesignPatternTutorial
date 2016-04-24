package com.shail.designpatterns.creational.prototype;

import java.awt.List;
import java.util.ArrayList;

public class PrototypeDesignControllerClass implements Cloneable {

	private ArrayList<Student> mStudentList = new ArrayList<Student>();

	public void loadStudentDetails() {
		Student s1 = new Student();
		s1.setName("Temp1");
		s1.setRollNumber("Temp_000999");
		mStudentList.add(s1);

		Student s2 = new Student();
		s1.setName("Temp2");
		s1.setRollNumber("Temp_0098899");
		mStudentList.add(s2);

		Student s3 = new Student();
		s1.setName("Temp3");
		s1.setRollNumber("Temp_566779");
		mStudentList.add(s3);
	}

	public ArrayList<Student> getStudentDatabase() {
		return mStudentList;
	}

	@Override
	protected ArrayList<Student> clone() throws CloneNotSupportedException {
		ArrayList<Student> clonedList = new ArrayList<PrototypeDesignControllerClass.Student>();
		ArrayList<Student> studentDatabase = getStudentDatabase();
		for (Student student : studentDatabase) {
			clonedList.add(student);
		}
		return clonedList;
	}

	public static class Student {
		private String mName;
		private String mRollNumber;

		public String getName() {
			return mName;
		}

		public void setName(String mName) {
			this.mName = mName;
		}

		public String getRollNumber() {
			return mRollNumber;
		}

		public void setRollNumber(String mRollNumber) {
			this.mRollNumber = mRollNumber;
		}

		@Override
		public String toString() {
			return "[Student Name:"+getName()+",RollNumber:"+getRollNumber()+"]";
		}
	}
}
