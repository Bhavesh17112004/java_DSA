package com.bhavesh;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleSort {

	public static void main(String[] args) {
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(10);
		number.add(2);
		number.add(80);
		number.add(12);
		number.add(100);
		
		System.out.println("You Provide wise Order"+number);
		Collections.sort(number);
		System.out.println("Assending Order"+number);
		Collections.reverse(number);
		System.out.println("desending Order"+number);

	}

}
