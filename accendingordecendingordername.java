package com.bhavesh;

import java.lang.foreign.AddressLayout;
import java.util.ArrayList;
import java.util.Collections;

public class accendingordecendingordername {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Zara");
		name.add("Bhavesh");
		name.add("Karan");
		System.out.println("Student Provided name wise order"+name);
		Collections.sort(name);
		System.out.println("Studend name are Assending Order"+name);
		Collections.reverse(name);
		System.out.println("Student name are Decending Order"+name);
	}

}
