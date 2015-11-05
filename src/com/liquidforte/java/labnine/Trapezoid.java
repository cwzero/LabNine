package com.liquidforte.java.labnine;

public class Trapezoid extends Quadrilateral {
	// Assume side[1], side[3] parallel
	private int[] side;
	private int[] angle;
	
	public Trapezoid(int[] side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		/*
		 * https://www.quora.com/Is-it-possible-to-calculate-the-height-of-a-trapezoid-if-only-the-sides-are-known-If-yes-how
		 */
		double a1 = side[0];
		double a2 = side[2];
		double b1 = side[1];
		double b2 = side[3];
		double d = Math.abs(b1 - b2);
		double x = ((a1 * a1) - (a2 * a2) + (d * d)) / (2 * d);
		double h = Math.sqrt((a1 * a1) - (x * x));
		double area = ((b1 + b2) / 2) * h;
		return area;
	}
}
