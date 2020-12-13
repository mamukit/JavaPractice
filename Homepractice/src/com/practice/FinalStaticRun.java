package com.practice;

public class FinalStaticRun {

	public static void main(String[] args) {
		FinalStatic.studentClass = "Web Development Fundamentals";
		System.out.println(FinalStatic.studentClass);

		FinalStatic.classInfo();

		System.out.println("Before creating objects: " + FinalStatic.count);

		FinalStatic student1 = new FinalStatic();
		FinalStatic student2 = new FinalStatic();

		System.out.println("After creating objects: " + FinalStatic.count);

		student1.name = "Steven";
		student2.name = "Daniel";

		student1.studentName();
		student2.studentName();

		System.out.println(Math.E);
		System.out.println(FinalStatic.MY_CONSTANT);
	}

}
