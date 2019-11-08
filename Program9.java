import java.util.Scanner;

abstract class Vehicle {
	int year_of_manufacture;

	public abstract void getdata();

	public abstract void putdata();

	Vehicle() {
		year_of_manufacture = 1999;
	}
}

class Twowheeler extends Vehicle {
	Scanner sc = new Scanner(System.in);
	int a;

	public void getdata() {
		System.out.println("Enter The Year Of Manufacture Of TwoWheeler");
		a = sc.nextInt();
	}

	public void putdata() {
		System.out.println("The Year Of Manufacture of TwoWheeler is " + a);
	}

}

final class Fourwheeler extends Vehicle {
	Scanner sc = new Scanner(System.in);
	
	int a;

	public void getdata() {
		System.out.println("Enter The Year Of Manufacture Of FourWheeler");
		a = sc.nextInt();
	}

	public void putdata() {
		System.out.println("The Year Of Manufacture of FourWheeler is " + a);
	}

}

public class MyTwoWheeler extends Twowheeler {
	void getinp() {
		super.getdata();
		super.putdata();
	}
	public static void main(String[] args) {
		Fourwheeler f = new Fourwheeler();
		MyTwoWheeler m = new MyTwoWheeler();
		Twowheeler t=new Twowheeler();
		m.getdata();
		m.putdata();
		f.getdata();
		f.putdata();
		t.getdata();
		t.putdata();
	}
}
