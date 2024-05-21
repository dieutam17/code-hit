package Refactoring;

public class R_Circle {
	private final double PI = 3.14;
	double radius;

	public double area() {
		return radius * radius * PI;
	}

	public double primeter() {
		return 2 * PI * radius;
	}
}
