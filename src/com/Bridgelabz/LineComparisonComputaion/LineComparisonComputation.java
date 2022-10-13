package com.Bridgelabz.LineComparisonComputaion;

import java.util.Scanner;

public class LineComparisonComputation {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison computation");
		
		float lengthOfLine_1 = calculatelengthOfLine_1();
		float lengthOfLine_2 = calculatelengthOfLine_2();
		
		System.out.println(lengthOfLine_1);
		System.out.println(lengthOfLine_2);
		
			if (lengthOfLine_1 == lengthOfLine_2) {
				System.out.println("Both lines are equal");
			}else {
				System.out.println("Lines are not equal");
			}
	}
	static float calculatelengthOfLine_1() {
		System.out.println("Enter co-ordinate values for Line_1");
		
		Scanner src = new Scanner(System.in);
		System.out.print("Enter value of x1 coordinate for point P1 :");
		int x1 = src.nextInt();
		System.out.print("Enter value of y1 coordinate for point P1 :");
		int y1 = src.nextInt();
		System.out.print("Enter value of x2 coordinate for point P2 :");
		int x2 = src.nextInt();
		System.out.print("Enter value of y2 coordinate for point P2 :");
		int y2 = src.nextInt();
		
		float length = (float) Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		return length;
		
	}
	
	static float calculatelengthOfLine_2() {
		System.out.println("Enter co-ordinate values for Line_2");
		
		Scanner src = new Scanner(System.in);
		System.out.print("Enter value of x1 coordinate for point P1 :");
		int x1 = src.nextInt();
		System.out.print("Enter value of y1 coordinate for point P1 :");
		int y1 = src.nextInt();
		System.out.print("Enter value of x2 coordinate for point P2 :");
		int x2 = src.nextInt();
		System.out.print("Enter value of y2 coordinate for point P2 :");
		int y2 = src.nextInt();
		
		float length = (float) Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		return length;
		
	}

}
