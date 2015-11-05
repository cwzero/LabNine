package com.liquidforte.java.labnine;

public class QuadrilateralTest {
	public static void main(String[] args) {
		Trapezoid trap = new Trapezoid(new int[] {4, 6, 7, 2});
		Parallelogram par = new Parallelogram(10, 3, 65);
		Rectangle rect = new Rectangle(10, 4);
		Square square = new Square(10);
		for (Quadrilateral q: new Quadrilateral[] {trap, par, rect, square}) {
			System.out.println(q.getArea());
		}
	}
}
