package com.bhavesh;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {

	public static void main(String[] args) {
		Queue<String> Names=new LinkedList<String>();
		Names.add("Raj");
		Names.add("Karan");
		Names.add("Raj");
		System.out.println(Names);
		System.out.println(Names.peek());
	}

}
