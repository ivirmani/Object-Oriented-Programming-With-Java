package prog5;

import java.util.Scanner;

public class ProductOfMatrices {
	Scanner sc = new Scanner(System.in);

	void matrix() {
		int[][] a1 = new int[20][20];
		int[][] a2 = new int[20][20];
		int[][] a3 = new int[20][20];
		System.out.println("Enter The Order Of Matrix");
		int n = sc.nextInt();
		System.out.println("Enter The Elements Of First Matrix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter The Elements Of Second Matrix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a3[i][j] = 0;
				for (int k = 0; k < n; k++) {
					a3[i][j] += a1[i][k] * a2[k][j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a3[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
