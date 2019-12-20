package myPack;

import java.util.Scanner;
import java.lang.Math;

class Circle {
	double r;

	Circle(double r) {
		this.r = r;
	}

	double Area() {
		return (Math.PI * r * r);
	}
}

class Sector extends Circle {
	double angle;

	Sector(double r, double angle) {
		super(r);
		this.angle = angle;
	}

	double sectorArea() {
		return (0.5 * r * r * angle);
	}
}

class Segment extends Circle {
	double length;

	Segment(double r, double length) {
		super(r);
		this.length = length;
	}

	double segmentArea() {
		return (double) Math.pow(r,2)* Math.pow(((r-length)/r)-((r-length) * (2*r*length-Math.pow(length,2))),1/2);
	}
}

public class A {

	public static void main(String[] args) {
		double r, a, l;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius");
		r = sc.nextDouble();
		System.out.println("Enter the Angle");
		a = sc.nextDouble();
		System.out.println("Enter the Length");
		l=sc.nextDouble();
		Circle c = new Circle(r);
		Sector S = new Sector(r,a);
		Segment s=new Segment(r,l);
		System.out.println("Area of Circle Is "+c.Area());
		System.out.println("Area of Sector Is "+S.sectorArea());
		System.out.println("Area of Segmant Is "+s.segmentArea());
	}

}
