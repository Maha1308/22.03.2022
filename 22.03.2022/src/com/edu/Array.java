package com.edu;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		ArrayList<String>List=new ArrayList<String>();
		List.add("hello");
		List.add("Maha");
		List.add("How");
		List.add("Are you");
		System.out.println("value of 1 element"+List.get(0));
		
		System.out.println(List);
		System.out.println("**************************");
		
		ArrayList<Integer>iob=new ArrayList<Integer>();
		iob.add(12);
		iob.add(45);
		iob.add(23);
		iob.add(70);
		System.out.println("value of 2rd element is "+iob.get(1));
		System.out.println(iob);
	}

}
