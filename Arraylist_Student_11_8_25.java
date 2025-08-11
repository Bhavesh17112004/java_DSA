package com.bhavesh;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Student_11_8_25 {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Bhavesh");
		name.add("Karan");
		name.add("Ajay");
		name.add("Zeel");
		name.add("Sham");
		System.out.println("Student Name is:"+" "+name);
		Collections.sort(name);
		System.out.println("Assending order Student Name is:"+" "+name);
		Collections.reverse(name);
		System.out.println("Desending order Student Name is:"+" "+name);

	}

}
