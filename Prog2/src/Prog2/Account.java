package Prog2;

import java.util.Scanner;

public class Account {
	static Scanner sc = new Scanner(System.in);
	int accno;
	String name;
	int phone_no;
	float balance_amt;

	void getinput() {
		System.out.println("Enter Name - ");
		name = sc.next();
		System.out.println("Enter Account no. - ");
		accno = sc.nextInt();
		System.out.println("Enter phone no. - ");
		phone_no = sc.nextInt();
	}

	void Deposit() {
		System.out.println("Enter The Amount To Be Deposited - ");
		float a = sc.nextFloat();
		balance_amt += a;
		System.out.println("New Balance Is - " + balance_amt);
	}

	void Withdraw() {
		System.out.println("Enter The Amount To Be Withdrawn");
		float w = sc.nextFloat();
		if (balance_amt < w)
			System.out.println("Less Balance Available");
		else {
			balance_amt -= w;
			System.out.println("New Balance Is - " + balance_amt);
		}
	}

	public static void main(String[] args) {
		Account ac = new Account();
		System.out.println("Enter Your Details And Proceed");
		ac.getinput();
		while (true) {
			int ch;
			System.out.println("Enter\n1.Deposit\n2.Withdarw\n3.Exit\n");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				ac.Deposit();
				break;
			case 2:
				ac.Withdraw();
				break;
			case 3:
				System.exit(0);
			}
		}
	}

}
