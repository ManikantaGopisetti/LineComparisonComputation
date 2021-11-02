package com.linecomparision;

import java.util.Scanner; 

public class LineComparision {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x1 : ");
		double x1 = sc.nextDouble();
				
		System.out.println("Enter y1 : ");
		double y1 = sc.nextDouble();		
		
		System.out.println("Enter x2 : ");
		double x2 = sc.nextDouble();
		
		System.out.println("Enter y2 : ");
		double y2 = sc.nextDouble();
		
		double length1 =Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.println(length1);
		
		System.out.println("Enter x3 : ");
		double x3 = sc.nextDouble();
		
		System.out.println("Enter y3 : ");
		double y3 = sc.nextDouble();
		
		System.out.println("Enter x4 : ");
		double x4 = sc.nextDouble();
		
		System.out.println("Enter y4 : ");
		double y4 = sc.nextDouble();
		
		double length2 = Math.sqrt(Math.pow(x4-x3, 2)+Math.pow(y4-y3, 2));
		System.out.println(length2);
		
		Double le1=length1;
		Double le2=length2;
		
		if(le1.equals(le2)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		
	}

}
