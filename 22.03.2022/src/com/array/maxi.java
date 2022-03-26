package com.array;

import java.util.Scanner;

public class maxi {

	public static void main(String[] args) {
		int ar[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array element"+ar.length);
		for(int i=0; i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
	int max=ar[0];
	for(int i=1;i<ar.length;i++) {
		if(ar[i]>max) {
			max=ar[i];
		}
	}
	System.out.println("maximum of array element is"+max);

	int min=ar[0];
	for(int i=1;i<ar.length;i++)
	{
		if(ar[i]>min) {
			max=ar[i];
		}
	}
	

System.out.println("minimum of array element is"+min);
	}
}
