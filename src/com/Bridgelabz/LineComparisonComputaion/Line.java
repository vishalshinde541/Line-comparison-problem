package com.Bridgelabz.LineComparisonComputaion;

public class Line {
	Point p1;
	Point p2;
	int length;

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	float getLength() {
		return (float) Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
	}

}
