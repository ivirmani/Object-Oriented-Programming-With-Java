package prog4;

import java.util.Scanner;

public class Complex {
	Scanner sc = new Scanner(System.in);
	float img1;
	float real1;
	float img2;
	float real2;

	Complex() {
		this.img1 = img1;
		this.real1 = real1;
		this.img2 = img2;
		this.real2 = real2;
	}

	void enter() {
		System.out.println("Enter The Real And Imaginary Part Of The First Complex Number");
		real1 = sc.nextFloat();
		img1 = sc.nextFloat();
		System.out.println("Enter The Real And Imaginary Part Of The Second Complex Number");
		real2 = sc.nextFloat();
		img2 = sc.nextFloat();
		System.out.println("\nThe Numbers Are");
		System.out.println(real1 + "+" + img1 + "i");
		System.out.println(real2 + "+" + img2 + "i");
	}

	void sum() {
		float sum1 = real1 + real2;
		float sum2 = img1 + img2;
		System.out.println("\nSum Is " + sum1 + "+" + sum2 + "i");
	}

	void subtract() {
		float sub1 = real1 - real2;
		float sub2 = img1 - img2;
		System.out.println("\nDifference In Complex Numbers Is " + sub1 + "+" + sub2 + "i");
	}

	void multiply() {
		float prod1 = real1 * real2;
		float prod2 = img1 * img2;
		float prod = prod1 - prod2;
		System.out.println("\nProduct Of Complex Numbers Is " + prod);
	}
}
