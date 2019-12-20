package Prog3;

import java.util.Scanner;

public class Stack {
	Scanner sc = new Scanner(System.in);
	int top;
	int a[];
	int size;
	int item;
	Stack(){
		top=-1;
		a= new int[5];
		size=5;
	}

	void push() {
		if (top == size - 1)
			System.out.println("Stack Overflow Condition");
		else {
			System.out.println("Enter Data");
			item = sc.nextInt();
			top++;
			a[top] = item;
		}
	}

	void pop() {
		if (top == -1)
			System.out.println("Stack Underflow Condition");
		else {
			int ditem = a[top];
			System.out.println("Deleted Item Is " + ditem);
			top--;
		}
	}

	void display() {
		if (top == -1)
			System.out.println("No Data In Stack");
		else {
			for (int i = 0; i <= top; i++) {
				System.out.print(a[i] + "-->");
			}
		}
	}
}
