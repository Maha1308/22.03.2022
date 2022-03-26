package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

class student{
	int id;
	String name;
float fees;
	static String collegeName="Pondicherry university";
	public student(int id, String name, float fees)
	{
		super();
	this.id=id;
	
		this.name=name;
		this.fees=fees;
	}
	@Override
	public String toString()
	{
		return "Student[id="+id+",Name="+name+",fees="+fees+"]";
	
	}
}

public class Mainclass {

	public static void main(String[] args) {
		student s1=new student(201,"maha",8394.2f);
		student s2=new student(231,"Mohan",9845.34f);
		student s3=new student(832,"ravi",8344.23f);
		ArrayList<student>slist=new ArrayList<student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		System.out.println(slist);
		Iterator<student>sit=slist.iterator();
		while(sit.hasNext())
				{
			student sob=sit.next();
			System.out.println(sob.name+" " +sob.id+" " +sob.fees);
				}
	}

}
