package abc;

import java.util.Scanner;

public class BubbleSort {
	static Scanner sc = new Scanner(System.in);

	void bs() {
		int a[] = new int[10];
		System.out.println("Enter The Elements Of Array");
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The Elements Of Array Are ");
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted Elements Are");
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
	}
}
