package com.edu;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Hello");
		list.add("Veena");
		list.add(2,"How");
		list.add("are");
		list.add("You");
		System.out.println("value of 1 element: "+list.get(0));
		System.out.println(list);
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("Are");
		list1.add("you");
		System.out.println(list.contains("are"));
		System.out.println(list.contains(list1));
		list1.addAll(list);
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("Before suffle");
		System.out.println(list1);
		Collections.shuffle(list1);
		System.out.println("after shuffle"+list1);
		
	}

}
