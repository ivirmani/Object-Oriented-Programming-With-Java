package prog9;

import java.util.Scanner;

public class MainClass {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MyTwoWheeler m1 = new MyTwoWheeler();
		System.out.println("Enter the Year of manufacture of TwoWheeler");
		m1.putdata(sc.nextInt());
		System.out.println("The Year Of Manufacture Of TwoWheeler Is " + m1.getData());
		FourWheeler f = new FourWheeler();
		System.out.println("Enter the Year of manufacture of FourWheeler");
		f.putData(sc.nextInt());
		System.out.println("The Year Of Manufacture Of FourWheeler Is " + f.getData());
	}

}
