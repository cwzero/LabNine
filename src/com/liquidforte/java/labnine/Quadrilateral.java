package com.liquidforte.java.labnine;

public abstract class Quadrilateral {
	private int[][] coordinates = new int[4][2];

	public Quadrilateral() {

	}

	public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		coordinates[0][0] = x1;
		coordinates[0][1] = y1;

		coordinates[1][0] = x2;
		coordinates[1][1] = y2;

		coordinates[2][0] = x3;
		coordinates[2][1] = y3;

		coordinates[3][0] = x4;
		coordinates[3][1] = y4;
	}

	public abstract double getArea();

	public int getX(int coord) {
		return coordinates[coord][0];
	}

	public int getY(int coord) {
		return coordinates[coord][1];
	}

	public void setX(int index, int value) {
		coordinates[index][0] = value;
	}

	public void setY(int index, int value) {
		coordinates[index][1] = value;
	}
}
