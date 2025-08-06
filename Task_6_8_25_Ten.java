package com.bhavesh;

import java.util.ArrayList;

public class Task_6_8_25_Ten {

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Apple");
		name.add("Redmi");
		name.add("Poco");
		name.add("infinix");
		System.out.println("Phone brand name is:"+name);
		int middlename=name.size()/2;
		name.add(middlename,"samsung");
		System.out.println("After add name is:"+name);

	}

}
