package abc;

public class Fibonacci {

	void fibnorec(int n) {
		int i = 0;
		int f = 0;
		int next = 1;
		if (n > 0) {
			System.out.println(f + " ");
			System.out.println(next + " ");
			for (i = 2; i < n; i++) {
				{
					int temp = f + next;
					System.out.println(temp + " ");
					f = next;
					next = temp;
				}
			}
		} else
			System.out.println("Wrong Input");
	}
}
