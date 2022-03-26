package com.array;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int ar[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array element"+ar.length);
		for(int i=0; i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("array element are");
		for(int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("sum of all array element");
		int s=0;
		for(int i=0;i<ar.length;i++)
		{
			s=s+ar[i];
		}
		System.out.println("sum="+s);
		System.out.println("average"+(float)s/ar.length);
	}

}
