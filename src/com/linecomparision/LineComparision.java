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
		
		double length =Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		
		System.out.println(length);
	}

}
