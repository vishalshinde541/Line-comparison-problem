package com.Bridgelabz.LineComparisonComputaion;

import java.util.Scanner;

public class LineComparisonComputation {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison computation");
		
		float lengthOfLine_1 = calculatelengthOfLine_1();
		float lengthOfLine_2 = calculatelengthOfLine_2();
		
		System.out.println("length of 1st line : " + lengthOfLine_1);
		System.out.println("length of 2nd line : " + lengthOfLine_2);
		
		 Integer l1=new Integer((int) lengthOfLine_1);
	     Integer l2=new Integer((int) lengthOfLine_2);

	        if (l1.compareTo(l2) > 0) {
	            System.out.println("line 1 is greater than line 2");
	        }else if (l1.compareTo(l2) < 0) {
	            System.out.println("line 1 is smaller than line 2");
	        }else
	            System.out.println("both Lines are equal");
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
