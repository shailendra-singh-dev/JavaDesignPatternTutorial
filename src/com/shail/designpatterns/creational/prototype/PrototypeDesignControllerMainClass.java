package com.shail.designpatterns.creational.prototype;

import java.util.ArrayList;

import com.shail.designpatterns.creational.prototype.PrototypeDesignControllerClass.Student;

public class PrototypeDesignControllerMainClass {

	public static void testProtoTypeDesign() {
		PrototypeDesignControllerClass prototypeDesignControllerClass = new PrototypeDesignControllerClass();
		prototypeDesignControllerClass.loadStudentDetails();

		try {
			// 1 clone..
			ArrayList<Student> studentDatabaseClone1 = prototypeDesignControllerClass
					.clone();
			PrototypeDesignControllerClass.Student clonedStudent1 = new PrototypeDesignControllerClass.Student();
			clonedStudent1.setName("Clone1_Student_1");
			clonedStudent1.setRollNumber("Clone1_Student_RollNumber_111");
			studentDatabaseClone1.add(clonedStudent1);

			// 2 clone..
			ArrayList<Student> studentDatabaseClone2 = prototypeDesignControllerClass
					.clone();
			PrototypeDesignControllerClass.Student clonedStudent2 = new PrototypeDesignControllerClass.Student();
			clonedStudent2.setName("Clone1_Student_2");
			clonedStudent2.setRollNumber("Clone1_Student_RollNumber_222");
			studentDatabaseClone2.add(clonedStudent2);

			// 2 clone..
			ArrayList<Student> studentDatabaseClone3 = prototypeDesignControllerClass
					.clone();
			PrototypeDesignControllerClass.Student clonedStudent3 = new PrototypeDesignControllerClass.Student();
			clonedStudent3.setName("Clone1_Student_3");
			clonedStudent3.setRollNumber("Clone1_Student_RollNumber_333");
			studentDatabaseClone3.add(clonedStudent3);
			
			System.out.print("\n Clone1:"+studentDatabaseClone1);
			System.out.print("\n Clone2:"+studentDatabaseClone2);
			System.out.print("\n Clone3:"+studentDatabaseClone3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
