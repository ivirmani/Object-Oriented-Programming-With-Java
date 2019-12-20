package Prog3;

import java.util.Scanner;

public class Menu {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			Stack s = new Stack();
			int ch;
			System.out.println("\nEnter\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT\n");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				s.push();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong Option\nTry Again");
				break;
			}
		}
	}

}
