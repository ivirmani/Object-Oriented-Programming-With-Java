package abc;

public class Fibonacci_rec {
	public int fibrec(int k) {
		if (k < 2)
			return k;
		else
			return (fibrec(k - 1) + fibrec(k - 2));
	}
}