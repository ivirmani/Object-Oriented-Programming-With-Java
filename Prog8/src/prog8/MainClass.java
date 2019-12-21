package prog8;

import java.util.Scanner;

public class MainClass {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter The Radius Of Circle");
		float r = sc.nextFloat();
		System.out.println("Enter The Angle");
		float a = sc.nextFloat();
		System.out.println("Enter The Length Of The Segment");
		float h = sc.nextFloat();
		Circle c = new Circle();
		System.out.println("Area Of Circle Is " + c.area(r));
		Sector s = new Sector();
		System.out.println("Area Of Segment Is " + s.sectorArea(r, a));
		Segment S = new Segment();
		System.out.println("Area Of Segment Is " + S.segmentArea(r, a, h));
	}

}
