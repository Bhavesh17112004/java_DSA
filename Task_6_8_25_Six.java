package com.bhavesh;

import java.util.ArrayList;

public class Task_6_8_25_Six {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Surat");
		name.add("Pune");
		name.add("Mumbai");
		name.add("Ahmadabad");
		name.add("Nashik");
		System.out.println("City Names in India is:"+name);
		name.add(2, "Baruch");
		System.out.println("After add one more city so total city name is:"+name);

	}

}
