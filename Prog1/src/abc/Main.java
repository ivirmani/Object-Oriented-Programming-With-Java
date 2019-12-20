package abc;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Fibonacci a = new Fibonacci();
		System.out.println("Enter The Number Of Terms Upto Which Fibonacci Series Is To Be Printed");
		int p = sc.nextInt();
		System.out.println("---------------------------------------------------------------------------------");
		a.fibnorec(p);
		System.out.println("---------------------------------------------------------------------------------");
		int i = 0;
		Fibonacci_rec t = new Fibonacci_rec();
		for (i = 0; i < p; i++)
			System.out.println(t.fibrec(i) + " ");
		System.out.println("---------------------------------------------------------------------------------");
		CheckPrime c = new CheckPrime();
		if (c.isprime(p) == 0)
			System.out.println("Enter A Number Greater Than 2");
		else if (c.isprime(p) == 1)
			System.out.println(p + " Is Not Prime");
		else
			System.out.println(p + " Is Prime");
		BubbleSort b = new BubbleSort();
		b.bs();
	}

}
