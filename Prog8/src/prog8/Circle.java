package prog8;

import java.lang.Math;

public class Circle {
	float r;

	Circle() {
		r = 0;
	}

	float area(float r) {
		return (float) (Math.PI * r * r);
	}
}
