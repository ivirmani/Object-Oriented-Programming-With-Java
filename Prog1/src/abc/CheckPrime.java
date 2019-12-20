package abc;

public class CheckPrime {
	public static int isprime(int z) {
		if (z < 2)
			return 0;
		else {
			for (int i = 2; i < (z / 2); i++)
				if (z % i == 0)
					return 1;
		}
		return 2;
	}
}
