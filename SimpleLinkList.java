package com.bhavesh;
import java.util.Collections;
import java.util.LinkedList;
public class SimpleLinkList {
	public static void main(String[] args) {
		LinkedList<Integer> number=new LinkedList<Integer>();
		LinkedList<String> name=new LinkedList<String>();
		number.add(10);
		number.add(20);
		number.add(80);
		number.add(40);
		number.add(50);
	
		name.add("Raj");
		name.add("Karan");
		name.add("yash");
	
		Collections.sort(number);
		System.out.println(number);
		System.out.println(name);	

	}

}
