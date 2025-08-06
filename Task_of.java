package com.bhavesh;

import java.util.ArrayList;
import java.util.Collections;

public class Task_of {

	public static void main(String[] args) {
		ArrayList<String> studentList =new ArrayList<String>();
		studentList.add("Bhavesh");
		studentList.add("chetan");
		studentList.add("Raj");
		studentList.add("Karan");
		studentList.add("Sham");
		System.out.println("Original Student List:");
		for(String student:studentList) {
			System.out.println(student);
		}
		Collections.reverse(studentList);
		
		System.out.println("\nReverse Student List:");
		for (String student:studentList) {
			System.out.println(student);
		}
		

	}

}
