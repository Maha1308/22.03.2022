package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class IteratorMethod {

	public static void main(String[] args) {
		ArrayList<Integer>itlist=new ArrayList<Integer>();
		//using loop
		for (int i=1;i<=10;i++)
		{
			itlist.add(i);
		}
		System.out.println(itlist);
		//using for each loop
		for(Integer i:itlist) {
			System.out.println(i);
		}
		//individual element to display
		Iterator<Integer> it =itlist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//using listIterator
		ListIterator<Integer> lob = itlist.listIterator();
		//forward direction
		System.out.println("ListIterator forward diretion");
		while(lob.hasNext())
		{
			System.out.println(lob.next());
		}
		System.out.println("listIterator reverse direction");
		while(lob.hasPrevious())
		{
			System.out.println(lob.previous());
		}
		
		
		
		
		
	}

}
