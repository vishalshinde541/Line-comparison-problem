package com.Bridgelabz.LineComparisonComputaion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation");

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter values for x1,y1 and x2,y2 of line1");
		Point p1 = new Point(scanner.nextInt(), scanner.nextInt());
		Point p2 = new Point(scanner.nextInt(), scanner.nextInt());
		Line line1 = new Line(p1, p2);
		Float length1 = line1.getLength();

		System.out.println("enter values for x1,y1 and x2,y2 of line2");
		Point p3 = new Point(scanner.nextInt(), scanner.nextInt());
		Point p4 = new Point(scanner.nextInt(), scanner.nextInt());
		Line line2 = new Line(p3, p4);
		Float length2 = line2.getLength();

		System.out.println("Length of line1 = " + length1);
		System.out.println("Length of line2 = " + length2);

		if (length1.equals(length2)) {
			System.out.println("both lines are equal");
		} else if (length1.compareTo(length2) > 0) {
			System.out.println("line1 is greater than line 2");
		} else if (length1.compareTo(length2) < 0) {
			System.out.println("line1 is smaller than line 2");
		}
	}

}
