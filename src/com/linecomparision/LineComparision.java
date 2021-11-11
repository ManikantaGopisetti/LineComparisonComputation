package com.linecomparision;

import java.util.Scanner;

public class LineComparision {

	double pointx1, pointy1, pointx2, pointy2, length;

	public LineComparision(double x1, double x2, double x3, double x4) {

		this.pointx1 = x1;
		this.pointy1 = x2;
		this.pointx2 = x3;
		this.pointy2 = x4;

	}

	public double lineLength() {

		double length = Math.sqrt(Math.pow(pointx2 - pointx1, 2) + Math.pow(pointy2 - pointy1, 2));
		return length;
	}

	public static void equal(String l1, String l2) {

		if (l1.equals(l2)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}

	public static void compare(String l1, String l2) {

		int compare = l1.compareTo(l2);

		if (compare > 0) {
			System.out.println("length1 greater than length2");
		} else if (compare < 0) {
			System.out.println("length1 less than length2");
		} else {
			System.out.println("length1 equal length2");
		}

	}

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

		System.out.println("Enter x3 : ");
		double x3 = sc.nextDouble();

		System.out.println("Enter y3 : ");
		double y3 = sc.nextDouble();

		System.out.println("Enter x4 : ");
		double x4 = sc.nextDouble();

		System.out.println("Enter y4 : ");
		double y4 = sc.nextDouble();

		LineComparision lc1 = new LineComparision(x1, y1, x2, y2);

		double length1 = lc1.lineLength();
		System.out.println(length1);

		LineComparision lc2 = new LineComparision(x3, y3, x4, y4);

		double length2 = lc2.lineLength();
		System.out.println(length2);
		
		String le1=Double.toString(length1);
		String le2=Double.toString(length2);
		
		equal(le1, le2);

		compare(le1, le2);
		
		sc.close();
	}
}
