public class Stack {
	int tos;
	int[] myStack = new int[10];

	Stack() {
		tos = -1;
	}

	void push(int i) {
		if (tos == 9) {
			System.out.println("Stack Is Full");
		} else {
			myStack[++tos] = i;
		}
	}

	int pop() {
		if (tos < 0) {
			System.out.println("Stack Is Empty");
			return 1;
		} else {
			return myStack[tos--];
		}
	}

	void dispContStack() {
		if (tos < 0) {
			System.out.println("Stack Is Empty");
		} else {
			for (int i = 0; i <= tos; i++) {
				System.out.println(myStack[i]);
			}
		}
	}
}
public class DemoStack {

	public static void main(String[] args) {
		Stack myStack = new Stack();
		for (int i = 0; i < 10; i++) {
			myStack.push(i);
		}
		int x = myStack.pop();
		System.out.println(x);
		myStack.dispContStack();

	}
}
