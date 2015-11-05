package com.liquidforte.java.labnine;

public class Parallelogram extends Quadrilateral {
	private int length;
	private int width;
	private int angleA;
	
	public Parallelogram(int length, int width, int angleA) {
		this.length = length;
		this.width = width;
		this.angleA = angleA;
	}

	@Override
	public double getArea() {
		return length * width;
	}
}
