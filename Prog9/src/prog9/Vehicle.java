package prog9;

public abstract class Vehicle {
	int yom;

	Vehicle() {
		yom = 0;
	}

	abstract int getData();

	abstract void putData(int x);
}
