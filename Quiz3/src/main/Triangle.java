package main;

public class Triangle extends GeometricObject {
	// Side data fields
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// No-arg constructor
	public Triangle() {
	}

	// Triangle creating constructor
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// Accessor methods
	public double getSide1() {
		return this.side1;
	}

	public double getSide2() {
		return this.side2;
	}

	public double getSide3() {
		return this.side3;
	}

	public double getArea() {
		double a = (side1 + side2 + side3);
		return Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
	}

	// Perimeter returner
	public double getPerimeter() {
		return (side1 + side2 + side3);
	}

	// Description
	@Override
	public String toString() {
		String info = "The side lengths of this triange are: " + side1
				+ ", " + side2 + ", " + side3 + ". " + "The perimeter is: "
				+ this.getPerimeter() + "The area is: " + this.getArea();
		return info;
	}
}
