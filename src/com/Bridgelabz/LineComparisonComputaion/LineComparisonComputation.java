package com.Bridgelabz.LineComparisonComputaion;

import java.util.Scanner;

public class LineComparisonComputation {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison computation");
			
		Scanner src = new Scanner(System.in);
		System.out.print("Enter value of x1 coordinate for point P1 :");
		int x1 = src.nextInt();
		System.out.print("Enter value of y1 coordinate for point P1 :");
		int y1 = src.nextInt();
		System.out.print("Enter value of x2 coordinate for point P2 :");
		int x2 = src.nextInt();
		System.out.print("Enter value of y2 coordinate for point P2 :");
		int y2 = src.nextInt();
		
		double length = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		
		System.out.println("Length of line : " + length + " mm");
		
		
	}

}
